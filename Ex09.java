import java.io.PrintStream;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner leitor = new Scanner (System.in);
		
		x duplo;
		
		
		System.out.println ("Digite o preço de compra do produto:");
		
		double x = leitor.nextDouble ();
		
		if (x <= 20)
			
			System.out.println ("Deverá vender o produto pelo valor:" + (x * 45/100 + x) + "R $.");
		
		else
		
	 System.out.println ( " Devera vender tal PRODUTO cabelo Preço de " + (x * 30 / 100 + x) + " R $. " );
	}

}
