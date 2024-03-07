import java.util.Scanner;

public class Vendas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Endereco end1 = new Endereco();
		
		System.out.println( "\nInforme o cep ");
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
		
		
		
		
	
	
	
	
	
	}
}
