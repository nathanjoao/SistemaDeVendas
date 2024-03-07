public class Pessoa {

	private String nome;
	private String cpf;
	private String rg;
	private Endereco endereco;
	
	public boolean setCpf(String cpf) {
		if ( cpf.length() == 11 ) {
			this.cpf = cpf;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public boolean setNome(String nome) {
		if ( nome.length() >= 3 ) {
			this.nome = nome;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getNome() {
		if (this.nome == null) {
		return "inválido";	
		}
		else {
			return nome;
		}
	}
	
	public boolean setRg(String rg) {
		if ( rg.length() == 10 ) {
			this.rg = rg;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getRg() {
		return rg;
	}

	public void setEndereco (Endereco endereco) {
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

}
