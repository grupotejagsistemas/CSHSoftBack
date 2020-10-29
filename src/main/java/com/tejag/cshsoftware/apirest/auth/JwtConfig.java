package com.tejag.cshsoftware.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEogIBAAKCAQEApcYRXXXm/xAta1Na1AvxeO1/ISQs/2C7m5V4cv11jncYZywY\r\n" + 
			"dWtfdVtIk1zlYL3kFJA01Q+4AUphBOKuIDY4/06jcR0kVX6OVJUbuwYmVwoSZVnb\r\n" + 
			"9Xhari5TQrU1Z7jh3ayEmiOwy7sw8bJOEO5/B9KdFHF3IB4q7v4uPB4huTr5WJBG\r\n" + 
			"jmt08QCNmgIgr5kdgXXb+FmoPSdEYCrolNfoajtcA4J2ySBUJYOOn6mVhBhJdqyj\r\n" + 
			"7NkPiAR1WR6hMzqHBbW1GVFw7UQdayxXXc9ytR/dbs12trv4O3JRny7fNvM5xP7c\r\n" + 
			"whyYsUoJME7ybkDqPJ+6WRsxjogXim5RozuXsQIDAQABAoIBACjbxcHsYm/xc9Bl\r\n" + 
			"LhjfjLfKibAIc5LKK9NwJszozcW8cuZTBwBB47hQNHYlyl9qzkGHPY5aHncq9vi2\r\n" + 
			"SkakNq4umrgxf5gW5kvQqJITNPX1BI24dS9uZ6NQxbLGaRBUkE8Ly28WZugADlM0\r\n" + 
			"KGuh7OtnrNGyGbNv3BMl0Q1+O7+kdOQNI4GBgtm2CkSWmCP2PJpI7453XD3EaS/u\r\n" + 
			"Y9xgz78Ixm155ewFBuqlsvgAlqE+7ycuagHYsMMO00xl1/PLkp2vSbw5efp+rv9U\r\n" + 
			"n6C7hySAxuRSe7FSsxtN/B+zOm/s722kvSD52EjKQxUhrOYB/M5ovB91L0J1xXaZ\r\n" + 
			"6+LYTMUCgYEA07sJc2hs+F1jFzHEKGjs5ERCCKtKTL22FYtX0qRE3zz977j4ysFA\r\n" + 
			"+/CzurxaRIz1yGRQiUc9hDitAna8/k2iT/QXnbt5BC9bvQAdNO7XHEGe72YNps/x\r\n" + 
			"D7GhVcSv2uoZALp+TnhfMObqUVeoDpssBAY9A9zJKR2dlwmfSRWy3U8CgYEAyG8r\r\n" + 
			"YuI1wqeqRLZce34Onh89hvPh0Eh0GYqc60N3iWzAk9Q9Yxj1N2e5H3lSihHo44U8\r\n" + 
			"d7RyUA56/b6wPTP9EXDF7XiUETOemCQgocEYIbUBrSYodY12660gD47grDpZ9Klh\r\n" + 
			"VoWZkWYDSsFTq1RwQK9ZJdVyfr1SJuv8Vh5u+v8CgYANsEDrKiwpXnhCjqAc8LOo\r\n" + 
			"ClWuk8xo67by66BQ6Pfe6uWL8wx6p0XZQ/WKtBSt6+MUApBGX8m1W6iryRts4X4F\r\n" + 
			"50UDmJQ5Vgp7TJ+WxX44wHFTDukBCN6P4i8JCX9JCut05Zm23wdgdP1fJuihkRym\r\n" + 
			"YfTd5A9JTjXbBu86XWHD9wKBgE+OeL0mJsqdvGLLs4e88FZo9gYD9aSzrYmZ0FE9\r\n" + 
			"lUvx47qJqtgTxvl37S4F/PIay8LLVsX41MrcBIuFTfTtFsz+Y0Gv862kPJYM+Prb\r\n" + 
			"ZxWx//lXRQXr4cEIFcq3HoyeGKiZNq6eFud0g2f/tpMxz+CM+SigQXL2+I3Ea4NP\r\n" + 
			"TyPHAoGAYesma1bU7bm5g3+g7mYdJUv0kfvMEyUJu8vkkJk+QF697sc0N5CnsF+u\r\n" + 
			"32LLZ2JPdySx5MCCxgnxR0D6i8FKkSC9kE8XK4CGKgKe8oLVrlnQHvmFCVFtKrxj\r\n" + 
			"21+PCmldHOBdhBbJRXSDrAJbXi1kEatdh6nzoeLRTc3GpeiTVZw=\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApcYRXXXm/xAta1Na1Avx\r\n" + 
			"eO1/ISQs/2C7m5V4cv11jncYZywYdWtfdVtIk1zlYL3kFJA01Q+4AUphBOKuIDY4\r\n" + 
			"/06jcR0kVX6OVJUbuwYmVwoSZVnb9Xhari5TQrU1Z7jh3ayEmiOwy7sw8bJOEO5/\r\n" + 
			"B9KdFHF3IB4q7v4uPB4huTr5WJBGjmt08QCNmgIgr5kdgXXb+FmoPSdEYCrolNfo\r\n" + 
			"ajtcA4J2ySBUJYOOn6mVhBhJdqyj7NkPiAR1WR6hMzqHBbW1GVFw7UQdayxXXc9y\r\n" + 
			"tR/dbs12trv4O3JRny7fNvM5xP7cwhyYsUoJME7ybkDqPJ+6WRsxjogXim5RozuX\r\n" + 
			"sQIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
}
