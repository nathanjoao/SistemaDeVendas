import java.util.ArrayList;
public class Pedidos {

	private int num;
	private String data;
	private int qtdItens;
	
	private Pessoa pessoa;
	private ArrayList<Produtos> produto = new ArrayList<>();
	
	public void addProduto(Produtos produto) {
		this.produto.add(produto);
	}
	public void removeProduto(int indice) {
		this.produto.remove(indice);
	}
	
	public Produtos getProduto(int indice) {
		return this.produto.get(indice);
	}
	
	public double getValorTotal() {
		double valorTotal = 0;
		for (int a = 0; a < produto.size(); a++) {
		valorTotal += getProduto(a).getPreco();
		}
		return valorTotal;
	}
	
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

	public String getListaP() {
		String lista = "";
		for (int cont = 0; cont < produto.size();cont++ ) {
			lista += getProduto(cont).getDescricao()+"\n";
		}
		return lista;
	}
	
}
