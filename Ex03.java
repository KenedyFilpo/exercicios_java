import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner leitor =  new  Scanner (System.in);
		
		int x;
		
		System.out.println ( " Digite um número e descubra se é positivo, negativo ou neutro: " );
		x = leitor . nextInt ();
		
		if (x >  0 )
			
			System.out.println ( " O número " + x + " é positivo. " );
		
		if (x == 0 )
			
		System.out.println ( " O número " + x + " é neutro. " );
		
		if (x < 0 )
			
		System.out.println ( " O número " + x + " é negativo. " );
		
		
		
		
		
	}

}
