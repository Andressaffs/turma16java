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
				System.out.println("O n�mero digitado � par.");
			}
			else if( (numeroDigitado%2) == 1)
			{
				System.out.println("O n�mero � impar.");
			}
			else if(numeroDigitado<0)
			{
				System.out.println("N�mero negativo.");
			}
			else if (numeroDigitado == 0)
			{
				System.out.println("Zero � neutro.");
			}
		}
	}

}
