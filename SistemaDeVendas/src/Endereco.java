public class Endereco {

	private String rua;
	private int num;
	private String bairro;
	private String complemento;
	private String cep;

	public boolean setRua (String rua) {
		if (rua.length() >= 2) {
			this.rua = rua;
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public String getRua () {
		return this.rua;
	}
	
	public boolean setNum (int num) {
		if (num > 9) {
			this.num = num;
			return true;
		}
		
		else {
			return false;	
		}
	}

	public int getNum() {
		return num;
	}
	
	public boolean setBairro(String bairro) {
		if (bairro.length() >= 3) {
			this.bairro = bairro;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getBairro() {
		return bairro;
	}

	public boolean setCep(String cep) {
		if (cep.length() == 8 ) {
			this.cep = cep;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getCep() {
		return cep;
	}
	
	public boolean setComplemento(String complemento) {
		if (complemento.length() >= 4 ) {
			this.complemento = complemento;
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public String getComplemento() {
		return complemento;
	}
	
}
