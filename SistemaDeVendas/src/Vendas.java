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
		
		System.out.println( "\nDigite o valor do produto 1");
		produto1.setPreco(sc.nextDouble());
		
		System.out.println( "\nDigite o valor do produto 2");
		produto2.setPreco(sc.nextDouble());
	
		pedido1.addProduto(produto1);
		pedido1.addProduto(produto2);
	
		System.out.println( "Valor do pedido: ");
		System.out.println("R$"+pedido1.getValorTotal());
	}
}
