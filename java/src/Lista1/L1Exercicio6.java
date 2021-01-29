package Lista1;

import java.util.Scanner;

public class L1Exercicio6 {
	public static void main (String args[])
	{
		try (Scanner ler = new Scanner(System.in)) {
			double x1, y1, x2, y2, d;
			
			System.out.println("Digite o valor de x1: ");
			x1= ler.nextInt();
			System.out.println("Digite o valor de y1: ");
			y1= ler.nextInt();
			System.out.println("Digite o valor de x2: ");
			x2= ler.nextInt();
			System.out.println("Digite o valor de y2: ");
			y2= ler.nextInt();
			
		    d= (double) (Math.sqrt(Math.pow(x2-x1,2)+(Math.pow(y2-y1,2))));
			
		   System.out.println("O resultante é: "+d);
		}
	}
}
