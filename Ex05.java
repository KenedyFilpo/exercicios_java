import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int num;
		
		Scanner leitor = new Scanner (System.in );
	
		
		System.out.println ("Digite um n�mero inteiro");
		num = leitor.nextInt ();
		
				
		if (num% 2 == 0)
		{
			System.out.println ("Seu n�mero � par");
		}
		else
		{
			System.out.println ("Seu n�mero � impar");
		}
		
		
	}

}


