package Lista4;

import java.util.Scanner;

public class L4Exercicio4 {
	public static void main(String[] args)
	{
		Scanner ler= new Scanner (System.in);
	    int idade=0,sexo=0, temperamento=0, opcao=0, pessoasCalmas=0, pessoasCalmas18=0,outrosCalmes=0,mulheresNervosas=0,nervosos40=0,homensAgressivos=0;
	    
	    
	    while(opcao != 2)
	    {
	    	System.out.println("Informe sua idade: ");
			idade = ler.nextInt();
			System.out.println("Informe seu sexo (1-feminino / 2-masculino / 3-outros): ");
			sexo = ler.nextInt();
			System.out.println("Você se considera uma pessoa:(1-calma / 2-nervosa / 3-agressiva ?");
			temperamento = ler.nextInt();
			System.out.println("Deseja continuar?(1-S / 2-N)");
			opcao=ler.nextInt();
			
			if(temperamento==1)
			{
				pessoasCalmas++;
				if(idade<18)
				{
					pessoasCalmas18++;
				}
				if(sexo==3)
				{
					outrosCalmes++;
				}
			}
			if(temperamento==2)
			{
				if(sexo==1)
				{
					mulheresNervosas++;
				}
				if(idade>40)
				{
					nervosos40++;
				}
			}
			if(sexo==2 && temperamento==3)
			{
				homensAgressivos++;
			}
	
	    }
	   
	    System.out.println("\nExistem: "+pessoasCalmas+" pessoas calmas.");	
		System.out.println("\t "+mulheresNervosas+" mulheres nervosas.");
		System.out.println("\t "+homensAgressivos+" homens agressivos.");	
		System.out.println("\t "+outrosCalmes+" outros calmes.");
		System.out.println("\t "+nervosos40+" pessoas nervosas com mais de 40 anos.");	
		System.out.println("\t "+pessoasCalmas18+" pessoas calmas com menos de 18 anos.");
	}
	
		
	
}
