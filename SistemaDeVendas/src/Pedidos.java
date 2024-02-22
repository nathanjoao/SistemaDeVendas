public class Pedidos {

	private int num;
	private String data;
	private int qtdItens;
	
	public boolean setData(String data) {
		if ( data.length() == 6 || data.length() == 8 ) {
			this.data = data;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getData() {
		return data;
	}
	
	public boolean setNum(int num) {
		if ( num > 0 ) {
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
	
	public boolean setQtdItens(int qtdItens) {
		if ( qtdItens >= 0 ) {
			this.qtdItens = qtdItens;
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getQtdItens() {
		return qtdItens;
	}
}
