import java.util.Scanner;

public class Boasvindas {

	public static void main(String[] args) {
		
		//Como vai?
	
			
		String nome, cidade;
		int idade;
				
		Scanner leitor = new Scanner (System.in);
				
		System.out.println("Digite seu nome: ");
		nome = leitor.next();
		System.out.println("Tudo bem? "+nome+" Você mora aonde?");
		cidade = leitor.next();
		System.out.println("Qual é a sua idade?");
		idade = leitor.nextInt();
				
		//Saida
		System.out.println("Boas vindas, "+nome);
	
		
		
		
		
		
		
		
	}
}