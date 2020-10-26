package com.tejag.cshsoftware.apirest.models.service.dto.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.tejag.cshsoftware.apirest.models.dto.ContratoDTO;
import com.tejag.cshsoftware.apirest.models.dto.ContratoPdfDTO;
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

	@Override
	public ByteArrayInputStream productsPDFReport(ContratoPdfDTO contratoNew) {
		Document document = new Document();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			PdfWriter.getInstance(document, out);
			document.open();

			document.addCreationDate();
			String imageUrl = "https://pbs.twimg.com/profile_images/1094034418858188800/M64z7C0m.jpg";
			Image image2;
			try {
				image2 = Image.getInstance(new URL(imageUrl));
				image2.setAlignment(Element.ALIGN_CENTER);
				document.add(image2);
				document.add(Chunk.NEWLINE);
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			com.itextpdf.text.Font titulo = FontFactory.getFont(FontFactory.COURIER_BOLD, 13, BaseColor.BLACK);
			Paragraph renglonTitulo = new Paragraph("Contrato de adopción: \r\n", titulo);
			renglonTitulo.setAlignment(Element.ALIGN_CENTER);
			document.add(renglonTitulo);
			document.add(Chunk.NEWLINE);
			com.itextpdf.text.Font fontMascota = FontFactory.getFont(FontFactory.COURIER_BOLD, 11, BaseColor.BLACK);
			Paragraph renglon1 = new Paragraph("Especie: " + contratoNew.getEspecie() + "\r\n" + "Sexo: "
					+ contratoNew.getSexo() + "\r\n" + "Fecha nacimiento: " + contratoNew.getFechaNacimiento(),
					fontMascota);
			renglon1.setAlignment(Element.ALIGN_LEFT);
			document.add(renglon1);
			Paragraph renglon2 = new Paragraph(
					"Nombre: " + contratoNew.getNombreMascota() + "\r\n" + "Rescate: " + contratoNew.getFechaRescate(),
					fontMascota);
			renglon2.setAlignment(Element.ALIGN_LEFT);
			document.add(renglon2);
			Paragraph renglon3 = new Paragraph("Nuevo nombre: " + contratoNew.getNuevoNombre() + "\r\n"
					+ "Particularidades física: " + contratoNew.getParticularidadesFisicas(), fontMascota);
			renglon3.setAlignment(Element.ALIGN_LEFT);
			document.add(renglon3);
			document.add(Chunk.NEWLINE);
			// add text to pdf file
			com.itextpdf.text.Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN, 11, BaseColor.BLACK);
			Paragraph para = new Paragraph(
					"Por intermediario de la presente, declaro haber recibido en forma gratuita a mi entera conformidad un animal de compañía por parte del refugio Colitas sin hogar. \r\n"
							+ "Comprometiéndome a cumplir las siguientes condiciones: \r\n"
							+ "•	Guardare al animal en un lugar a buen recaudo prodigándole buen trato.\r\n"
							+ "•	Le brindaré un lugar donde resguardarse de la intemperie al cual el animal accederá libremente. \r\n"
							+ "•	Le proporcionaré alimento suficiente y nutritivo, y también agua limpia suficiente para todo el día, todos los días.\r\n"
							+ "•	El animal no vivirá encadenado ni en lugares reducidos por periodos prolongados. \r\n"
							+ "•	Tendré extremo cuidado de que el animal no pueda escaparse a la vía pública, en caso de pérdida me comprometo a informar inmediatamente, es decir, en un plazo no mayor a una hora de la perdida al teléfono y mail que se denuncia en el contrato para poder efectuarse la respectiva búsqueda a través de las redes sociales y foros de proteccionistas. Como así también me comprometo a participar activamente en la búsqueda del animal entregando carteles con su descripción y/o foto en todas las veterinarias de la zona y cercanías comprendidas en un radio de mínimo 2 kilómetro. \r\n"
							+ "•	Le pondré un collar (elastizado en el caso de que se trate de un gato) con una identificación clara y visible con mi número de teléfono y/o dirección.\r\n"
							+ "•	En caso de enfermedad, comunicare la situación a Colitas sin hogar y procuraré la debida atención veterinaria.\r\n"
							+ "•	Si se trata de un animal no esterilizado, ME COMPROMETO A CASTRARLO antes de su primer celo (aproximadamente a los seis meses). Si el adoptante no cumple con el deber de informar el teléfono y domicilio del veterinario que efectuó la esterilización para corroborar la misma, podrá Colitas sin hogar retirar el animal si hubiese transcurrido 7 meses de la fecha de la firma del contrato por incumplimiento del contrato suscripto ya que es condición de la entrega del animal. \r\n"
							+ "•	Vacunaré al animal anualmente según indicación del veterinario y enviaré fotografías de la cartilla de vacunación a Colitas sin hogar.  \r\n"
							+ "•	Estoy de acuerdo con que un voluntario de Colitas sin hogar ingrese a mi domicilio a verificar las condiciones en que se encuentra durante toda la vida del animal adoptado. Como así también me comprometo a informar en forma fehaciente cualquier cambio de domicilio durante la vida del animal para que el refugio que me hace seguimiento pueda efectuarlo correspondientemente. \r\n"
							+ "•	Si por cualquier motivo no pudiera conservar al animal debo comunicárselo de manera fehaciente a Colitas sin hogar. \r\n"
							+ "•	En ningún caso abandonaré al animal.\r\n"
							+ "•	En caso de no cumplir con alguno de los puntos aquí enumerados, podrán retirar al animal de mi domicilio en el momento que Colitas sin hogar lo considere pertinente y podrán actuar sobre mí los alcances de la ley de protección animal 14.346 como así también se podrán reclamar daños y perjuicios que correspondieren por incumplimiento contractual. \r\n"
							+ "Teniendo claro conocimiento de las obligaciones que contraigo al adoptar un animal rescatado de Colitas sin hogar, presto en este acto mi conformidad firmando dos ejemplares de un mismo tenor a un solo efecto.\r\n"
							+ "",
					font);
			para.setAlignment(Element.ALIGN_JUSTIFIED);
			document.add(para);
			document.add(Chunk.NEWLINE);
			Paragraph adoptant = new Paragraph("Nombre completo adoptante: " + contratoNew.getNombreAdoptante()
					+ " \r\n" + "DNI: \r\n" + "Domicilio: " + contratoNew.getDomicilio() + " \r\n" + "Teléfono: "
					+ contratoNew.getTelefono() + " \r\n" + "Correo electrónico: " + contratoNew.getCorreo() + " \r\n"
					+ "", fontMascota);
			adoptant.setAlignment(Element.ALIGN_LEFT);
			document.add(adoptant);
			document.add(Chunk.NEWLINE);
			com.itextpdf.text.Font font1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 11, BaseColor.BLACK);
			Paragraph para1 = new Paragraph(
					"FIRMA ADOPTANTE: _______________         FIRMA COLITAS SIN HOGAR: _______________         ACLARACION: _______________\r\n"
							+ "\r\n"
							+ "Gracias de corazón por cambiarle la vida a un animal y demostrarnos que aún hay personas responsables y comprometidas en quien confiar. El refugio garantiza amor incondicional por parte del perro/gato adoptado. ¡Que sean muy felices!\r\n"
							+ "                                          ¡FELICITACIONES POR ADOPTAR Y NO COMPRAR!  \r\n" + "",
					font1);
			para1.setAlignment(Element.ALIGN_LEFT);
			document.add(para1);
			document.add(Chunk.NEWLINE);
			document.close();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return new ByteArrayInputStream(out.toByteArray());
	}

	@Override
	public ContratoPdfDTO getContratoPdf(Long id) {
		return this.getContratoPdfDTO(contratoService.getContratoById(id));
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

	public ContratoPdfDTO getContratoPdfDTO(Contrato entity) {
		ContratoPdfDTO contratoPdf = new ContratoPdfDTO();
		if (entity != null) {
			contratoPdf.setId(entity.getId_contrato());
			contratoPdf.setEspecie(entity.getMascotas().getEspecie());
			contratoPdf.setNombreMascota(entity.getMascotas().getNombre());
			contratoPdf.setNuevoNombre(entity.getNuevo_nombre());
			contratoPdf.setParticularidadesFisicas(entity.getMascotas().getParticularidadesFisica());
			contratoPdf.setSexo(entity.getMascotas().getSexo());
			contratoPdf.setFechaRescate(entity.getMascotas().getFechaRescate());
			contratoPdf.setFechaNacimiento(entity.getMascotas().getFechaNacimieto());
			contratoPdf.setNombreAdoptante(entity.getAdoptantes().getNombre_completo());
			contratoPdf.setDomicilio(entity.getAdoptantes().getDomicilio());
			contratoPdf.setTelefono(entity.getAdoptantes().getTelefono());
			contratoPdf.setCorreo(entity.getAdoptantes().getEmail());

		}

		return contratoPdf;
	}

}
