package Lista1;

import java.util.Scanner;

public class ImparPar {
	public static void main (String args[])
	{
		try (Scanner ler = new Scanner(System.in)) {
			int numeroDigitado;
			
			System.out.println("Digite um num positivo: ");
			numeroDigitado= ler.nextInt();
			
			if( (numeroDigitado%2) == 0)
			{
				System.out.println("O número digitado é par.");
			}
			else if( (numeroDigitado%2) == 1)
			{
				System.out.println("O número é impar.");
			}
			else if(numeroDigitado<0)
			{
				System.out.println("Número negativo.");
			}
			else if (numeroDigitado == 0)
			{
				System.out.println("Zero é neutro.");
			}
		}
	}

}
