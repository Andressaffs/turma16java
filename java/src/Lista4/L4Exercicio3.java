package Lista4;

import java.util.Scanner;

public class L4Exercicio3 {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in); //erro tb mds
		int idade=0,contadorJovem=0, contadorIdoso=0;
		
		while(idade>=0)
		{
			System.out.println("Informe a idade: ");
			idade=ler.nextInt();
		}
		if(idade<21)
		{
			contadorJovem++;
		}
		if(idade>50)
		{
			contadorIdoso++;
		}
		if (idade == -99)
		{
			System.out.println("\nFim do programa!");
		}
		System.out.println("O total de pessoas com até 21 anos é: "+contadorJovem+" e o total com mais de 50 anos é: "+contadorIdoso);
	}
}
