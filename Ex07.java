import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		
		String nom1, nom2;
		int id1, id2;
		
		
      Scanner leitor = new Scanner (System.in);
		
		
		System.out.println ("Escreva um nome");
		
		nom1 = leitor.next ();
		
		System.out.println ("Agora uma idade");
		
		id1 = leitor.nextInt ();
		
		System.out.println ("Escreva outro nome");
		
		nom2 = leitor.next ();
		
		System.out.println ("Agora outra idade");
		
		id2 = leitor.nextInt ();
		
		if (id1 <id2)
		{
			System.out.println ("nome" + nom2 + "idade" + id2);
		}
		else if (id1> id2)
		{
			System.out.println ("nome" + nom1 + "idade" + id1);
		
						
			
      	}

    }
	
}
