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
			if(bairro.contains("A-Z,a-z"));
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
		if (cep.length() == 8 && cep.matches(".*[0-9]*.")) {
			this.cep = cep;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getCep() {
		return this.cep.substring(0, 5)+"-"+this.cep.substring(5, 8); 
		//89250-120
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getComplemento() {
		return complemento;
	}	
}
