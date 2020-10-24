package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.tejag.cshsoftware.apirest.models.dto.ContratoDTO;
import com.tejag.cshsoftware.apirest.models.dto.ContratoPostDTO;
import com.tejag.cshsoftware.apirest.models.entity.Adoptante;
import com.tejag.cshsoftware.apirest.models.entity.Contrato;
import com.tejag.cshsoftware.apirest.models.entity.Mascota;
import com.tejag.cshsoftware.apirest.models.service.AdoptanteService;
import com.tejag.cshsoftware.apirest.models.service.ContratoService;
import com.tejag.cshsoftware.apirest.models.service.MascotaService;
import com.tejag.cshsoftware.apirest.models.service.dto.ContratoDTOService;

@Service
public class ContratoDTOServiceImpl implements ContratoDTOService {

	@Autowired
	private ContratoService contratoService;

	@Autowired
	private MascotaService mascotaService;

	@Autowired
	private AdoptanteService adoptanteService;

	@Override
	public void create(ContratoPostDTO contrato) {
		Contrato newContrato = new Contrato();

		Adoptante adoptante = new Adoptante();
		adoptante = adoptanteService.getById(contrato.getIdAdoptante());
		newContrato.setAdoptantes(adoptante);
		Mascota mascota = new Mascota();
		mascota = mascotaService.findById(contrato.getIdMascota());
		newContrato.setMascotas(mascota);
		newContrato.setNuevo_nombre(contrato.getNuevoNombre());

		contratoService.create(newContrato);
	}

	@Override
	public List<ContratoDTO> getContratos() {
		return this.getListaContratoDTO(contratoService.getContratos());
	}

	@Override
	public List<ContratoDTO> getByNombreMascota(String nombre) {
		return this.getListaContratoDTO(contratoService.findByNombreMascota(nombre));
	}

	// *********************************************************************************
	// ******************** Transformación Entity a DTO
	// ********************************
	// *********************************************************************************

	public ContratoDTO getContratoDTO(Contrato contrato) {
		ContratoDTO contratoDto = new ContratoDTO();

		if (contrato != null) {
			contratoDto.setIdContrato(contrato.getId_contrato());
			contratoDto.setMascota(contrato.getMascotas().getNombre());
			contratoDto.setAdoptante(contrato.getAdoptantes().getNombre_completo());
			contratoDto.setNuevoNombre(contrato.getNuevo_nombre());
		}

		return contratoDto;
	}

	public List<ContratoDTO> getListaContratoDTO(List<Contrato> listaContratos) {
		List<ContratoDTO> listaContratosDto = new ArrayList<ContratoDTO>();
		if (listaContratos != null) {
			for (Contrato contrato : listaContratos) {
				listaContratosDto.add(this.getContratoDTO(contrato));
			}
		}

		return listaContratosDto;
	}

	@Override
	public ByteArrayInputStream productsPDFReport(List<ContratoDTO> listaContratoDTO) {
		Document document = new Document();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			PdfWriter.getInstance(document, out);
			document.open();

			// add text to pdf file
			com.itextpdf.text.Font font = FontFactory.getFont(FontFactory.COURIER, 14, BaseColor.BLACK);
			Paragraph para = new Paragraph("Products List", font);
			para.setAlignment(Element.ALIGN_CENTER);
			document.add(para);
			document.add(Chunk.NEWLINE);

			PdfPTable table = new PdfPTable(2);

			// make column titles
			Stream.of("Ttile", "Description").forEach(headerTitle -> {
				PdfPCell header = new PdfPCell();
				com.itextpdf.text.Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
				header.setBackgroundColor(BaseColor.LIGHT_GRAY);
				header.setHorizontalAlignment(Element.ALIGN_CENTER);
				header.setBorderWidth(1);
				header.setPhrase(new Phrase(headerTitle, headFont));
				table.addCell(header);
			});
			for (ContratoDTO contratoDto : listaContratoDTO) {
				PdfPCell titleCell = new PdfPCell(new Phrase(contratoDto.getMascota()));
				titleCell.setPaddingLeft(1);
				titleCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				titleCell.setHorizontalAlignment(Element.ALIGN_LEFT);
				table.addCell(titleCell);

				PdfPCell descCell = new PdfPCell(new Phrase(contratoDto.getAdoptante()));
				descCell.setPaddingLeft(1);
				descCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				descCell.setHorizontalAlignment(Element.ALIGN_LEFT);
				table.addCell(descCell);
			}

			document.add(table);
			document.close();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return new ByteArrayInputStream(out.toByteArray());
	}

}
