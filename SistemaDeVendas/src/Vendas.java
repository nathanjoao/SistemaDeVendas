import java.util.Scanner;

public class Vendas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Endereco end1 = new Endereco();
		
		System.out.println( " Informe o cep ");
		end1.setCep(sc.nextLine());
		
		System.out.println( " Cep: "+end1.getCep());
	
		Pessoa joao = new Pessoa();
		joao.setEndereco(end1);
	
		System.out.println( " Endereço do João: "+joao.getEndereco().getCep());
	}
}
