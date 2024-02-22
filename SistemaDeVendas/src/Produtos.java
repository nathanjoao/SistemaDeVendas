public class Produtos {

	private String descricao;
	private double preco;
	
	public boolean setDescricao(String descricao) {
		if ( descricao.length() >= 8 ) {
			this.descricao = descricao;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public boolean setPreco(double preco) {
		if ( preco > 0.0 ) {
			this.preco = preco;
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getPreco() {
		return preco;
	}
	
}
