package Lista1;

import java.util.Scanner;

public class Exercicio3 {
	public static void main (String args[])
	{
		try (Scanner ler = new Scanner(System.in))
		{
			int segundos, horas, minutos, resultado;
			
			System.out.println("Digite os segundos: ");
			segundos= ler.nextInt();
			
			horas = segundos / 3600;
			minutos = (segundos % 3600) / 60;
			resultado = segundos % minutos;
			
			System.out.println("O evento teve: "+ horas + " horas " + minutos +" minutos e " + resultado + " segundos");
		}			
	}
}
