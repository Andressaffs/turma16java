package Lista3;

import java.util.Scanner;

public class L3Exercicio5 
{
	public static void main(String[] args)
	{
		Scanner ler = new Scanner (System.in);
		double indice;
		int industria;
		
		System.out.println("Insir o n�mero do seu grupo: ");
		industria=ler.nextInt();
		System.out.println("Insir o seu �ndice: ");
		indice=ler.nextInt();
		
		if(indice>= 0.3 && indice < 0.4)
		{
			System.out.println("�ndice =  "+indice+". O primeiro grupo deve suspender suas atividades!");
		}
		else if(indice>= 0.4 && indice < 0.5)
		{
			System.out.println("�ndice =  "+indice+". O primeiro e segundo grupo devem suspender suas atividades!");
		}
		else if(indice>= 0.5)
		{
			System.out.println("�ndice =  "+indice+". Todos os grupos devem suspender suas atividades!");
		}
		else if (indice>=0.05 && indice < 0.25)
		{
			System.out.println("�ndice =  "+indice+". �ndice com valor aceit�vel");
		}
	}
}
