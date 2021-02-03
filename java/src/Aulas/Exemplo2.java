package Aulas;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo2 {


		public static void main(String[] args) 
		{
			Locale.setDefault(Locale.US); //define o tipo de padronização
			//area = base * altura / 2
			Scanner leia = new Scanner(System.in);//instaciar = criar
			double base, altura, area=0.0, maiorTriangulo=0.0;
			
			for(int x=0; x<3; x++)
			{
				System.out.println("\nDigite a base do triangulo: ");
				base = leia.nextDouble();
				System.out.println("Digite a altura do triangulo: ");
				altura = leia.nextDouble();
				
				area = ((base * altura) / 2 );
				
				System.out.printf("A area do triangulo informado é %.2f", area);
		
			}

			if(area>maiorTriangulo)
			{
				maiorTriangulo=area;
				System.out.printf("\nO maior triangulo é: "+maiorTriangulo);
			}
			
	}
}


