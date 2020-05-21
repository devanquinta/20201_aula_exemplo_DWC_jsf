package control;


public class PrimeiroBean {
	
	public PrimeiroBean() {
		this.nome = "Thiago";
	}

	private String nome;
	private String phoneExt;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPhoneExt() {
		return phoneExt;
	}

	public void setPhoneExt(String phoneExt) {
		this.phoneExt = phoneExt;
	}
}
