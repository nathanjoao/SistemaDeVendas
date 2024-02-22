import java.util.Scanner;

public class Vendas {

	public static void mais(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Endereco end1 = new Endereco();
		
		System.out.println( " Informe o cep ");
		end1.setCep(sc.nextLine());
		
		System.out.println( " Rua: "+end1.getCep());
	}
}
