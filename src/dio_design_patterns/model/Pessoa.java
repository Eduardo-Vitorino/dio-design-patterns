package dio_design_patterns.model;

public class Pessoa {
	
	private String nome;
	private String dataNascimento;
	private String documento;

	public Pessoa() {
		this.nome = "";
		this.dataNascimento = "";
		this.documento = "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
}
