package Aulas;

import java.util.Scanner;

public class ExemploLaco {

	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in);
		double salario=0.00, mediaSalarios=0.00,mediaFilhos=0.00,maiorSalario=0.00,percentualSalario100=0.00,totalSalarios=0.00,contadorValor100=0.00;
		int numeroFilhos=0,totalFilhos=0;
		final int habitantes=20;
		
		for (int i=1; i<=habitantes; i++)
		{
			System.out.println("Digite o sal�rio do habitante "+i+" : ");
			salario=ler.nextDouble();
			System.out.println("Digite o n�mero de filhos deste habitante: ");
			numeroFilhos=ler.nextInt();
			
			totalSalarios= totalSalarios+salario;
			totalFilhos = totalFilhos + numeroFilhos;
			
			if(salario>maiorSalario)
			{
				maiorSalario=salario;
			}
			if(salario<=100)
			{
				contadorValor100++;
			}
			
			mediaSalarios=  totalSalarios / habitantes;
			mediaFilhos= totalFilhos / habitantes;
			percentualSalario100= ((contadorValor100 / habitantes)*100.00);
		}	
			System.out.println("\nM�dia salarial: R$ "+mediaSalarios+" reais");
			System.out.println("\nM�dia de filhos �: "+mediaFilhos+" e o total de filhos �: "+totalFilhos);
			System.out.println("\nO maior sal�rio foi: "+maiorSalario);
			System.out.println("\nN�mero de pessoas que ganham at� R$100 = "+contadorValor100+" sendo um  percentual total de "+percentualSalario100+"%");
			
		

	}

}
