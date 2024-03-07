import java.util.Scanner;

public class Vendas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Endereco end1 = new Endereco();
		
		System.out.println( "Informe o cep ");
		end1.setCep(sc.nextLine());
		
		System.out.println( "\nCep: "+end1.getCep());
	
		Pessoa joao = new Pessoa();
		joao.setEndereco(end1);
	
		System.out.println( "\nEndereço do João: "+joao.getEndereco().getCep());
		
		
		Produtos produto1 = new Produtos();
		Produtos produto2 = new Produtos();
		//produto.setNome()...
		
		Pedidos pedido1 = new Pedidos();
		Pedidos pedido2 = new Pedidos();
		//pedido.setNum();

		int quantPedidos;
		
		System.out.println( "\nQual a quantidade de proutos?");
		quantPedidos = sc.nextInt();
		
		for ( int cont = 0; cont < quantPedidos; cont++ ) {
			System.out.println( "\nDigite o nome do produto");
			sc.nextLine();
			produto1.setDescricao(sc.nextLine());
			
			System.out.println( "\nDigite o valor do produto");
			produto1.setPreco(sc.nextDouble());
			
			pedido1.addProduto(produto1);
		
		}
	
			System.out.println( "\nValor total:");
			System.out.println("R$"+pedido1.getValorTotal());
			System.out.println("\nLista dos produtos: "+pedido1.getListaP());
	}
}
