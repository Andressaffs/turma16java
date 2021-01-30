package Lista5Vetores;

import java.util.Scanner;


public class L5Exercicio2 {
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		int lancamentos[]=new int[10], maiorValor=0,contador=0;
		double somatorio=0.00, media=0.00;
		
		for(int i=0; i<10; i++)
		{
			System.out.println(randomInt(1, 6));
			lancamentos[i]=randomInt(1, 6);
			somatorio = somatorio+lancamentos[i];
			
			if(lancamentos[i] >= maiorValor)
			{
				if (lancamentos[i] == maiorValor)
				{
					contador++;
				}
				else
				{
					contador=1;
				}
				maiorValor=lancamentos[i];
			}
					
		}
		
		for (int i=0; i<10; i++)
		{
			System.out.printf("\nLançamento "+(i+1)+"° é igual a "+lancamentos[i]+"\n");
		}
		    media=somatorio/10;
			System.out.printf("\nA soma dos valores é "+somatorio+"\n");
			System.out.printf("\nA média é "+media+"\n");
			System.out.printf("\nMaior valor "+maiorValor+"\n");			
			System.out.printf("\nO maior valor repetiu "+(contador++)+" vezes\n");
		
	}
	public static int randomInt(int min, int max) 
	{
        double x = (int)(Math.random()*((max-min)+1))+min;    
        int y = (int)x;
        return y;
    }
}
