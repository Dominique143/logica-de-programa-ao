import java.util.Scanner;

public class Main
{//começa
	public static void main(String[] args) {//começa
	Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite sua idade em anos: ");
		int idadeAnos = scan.nextInt();
		
		System.out.println("Digite sua idade em meses: ");
		int idadeMeses = scan.nextInt();
		
		System.out.println("Digite sua idade em dias: ");
		int idadeDias = scan.nextInt();
		
		int resultado = idadeAnos * 365 + idadeMeses * 30 + idadeDias ;
		
		System.out.println( resultado);//saida de dados
		
	}//termina
}// termina
