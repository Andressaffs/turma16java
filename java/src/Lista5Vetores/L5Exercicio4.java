package Lista5Vetores;

import java.util.Scanner;

public class L5Exercicio4 {
     public static void main (String[] args)
     {
    	 Scanner leia = new Scanner(System.in);
    	 final int tamanho=3;
    	 int matriz[][]= new int [3][3];
    	 int somaMatriz=0, somaDiagonal=0;
    	 
    	 for(int x=0; x<tamanho; x++)
    	 {
    	 	for (int y=0; y<tamanho; y++)
    	 	{
    	 		System.out.print("Insira os valores: ");
    	 		matriz[x][y]=leia.nextInt();
    	 		somaMatriz+=matriz[x][y];
    	 		if(x==y)
    	 		{
    	 			somaDiagonal+= matriz[x][y];
    	 		}
    	 	}
    	 }
    	 System.out.printf("\nSoma diagonal: " +somaDiagonal);
    	 System.out.printf("\nSoma matriz: " +somaMatriz);
    	 }
     }

