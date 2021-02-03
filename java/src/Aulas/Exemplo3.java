package Aulas;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US); //define o tipo de padronização
		//area = base * altura / 2
		Scanner leia = new Scanner(System.in);//instaciar = criar
		double base1, altura1, area1=0.0, maiorTriangulo=0.0;
		double base2, altura2; 
		double base3, altura3; 
		double area2=0.0,area3=0.0;

			System.out.println("\nDigite a base do triangulo 1: ");
			base1 = leia.nextDouble();
			System.out.println("Digite a altura do triangulo 1: ");
			altura1 = leia.nextDouble();
			System.out.println("\nDigite a base do triangulo 2: ");
			base2 = leia.nextDouble();
			System.out.println("Digite a altura do triangulo 2: ");
			altura2 = leia.nextDouble();
			System.out.println("\nDigite a base do triangulo 3: ");
			base3 = leia.nextDouble();
			System.out.println("Digite a altura do triangulo 3: ");
			altura3 = leia.nextDouble();
			
			area1 = ((base1 * altura1) / 2 );
			area2 = ((base2 * altura2) / 2 );
			area3 = ((base3 * altura3) / 2 );
			
			System.out.printf("A area do triangulo informado é %.2f", area1);
			System.out.printf("A area do triangulo informado é %.2f", area2);
			System.out.printf("A area do triangulo informado é %.2f", area3);
			
			
			if(area1>area2 && area1>area3);
			{
				System.out.printf("O triângulo 1 tem a maior área: ",area1);
            }
			
		 if(area2>area1 && area2>area3);
			{
				System.out.printf("O triângulo 2 tem a maior área: ",area2);
            }
			if(area3>area1 && area3>area2);
			{
				System.out.printf("O triângulo 3 tem a maior área: ",area3);
            }
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
}