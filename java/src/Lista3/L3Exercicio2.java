package Lista3;

import java.util.Scanner;

public class L3Exercicio2 {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in);
		double C, E, salario, salarioTotal, salarioExcedente;
		int N;
		
		System.out.println("Insira seu c�digo: ");
		C=ler.nextDouble();
		System.out.println("Insira o n�mero de horas trabalhadas: ");
		N=ler.nextInt();
		
		 E = N - 50;
		 salario = N * 10.00;
	     salarioExcedente = (N%50) * 20.00;
		 salarioTotal = salario+salarioExcedente;
		 
		 if(N>50)
		 {
			 System.out.println("Seu sal�rio excedente � de R$ %2.f reais."+salarioExcedente);
		 }
		 else if(N<50)
		 {
			System.out.println("Seu sal�rio � de R$ %2f reais."+salario);
		 }
	}
}
