import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leitor = new Scanner (System.in);
		
		String senha;
		String AEDB = "AEDB";
		
		
		System.out.println ("Digite uma senha:");
		senha = leitor.next ();
	    
		if (senha.equalsIgnoreCase (AEDB))
		
		System.out.println ("Acesso permitido!");
		else 
		System.out.println ("Acesso negado!");
	}

}
