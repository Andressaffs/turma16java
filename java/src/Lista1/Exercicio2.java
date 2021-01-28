package Lista1;

import java.util.Scanner;

public class Exercicio2 {
  public static void main (String args[])
  {   
	  try (Scanner ler = new Scanner(System.in))
	  {
		int anos, meses, dias, resultado;
		  
		  System.out.println("Digite sua idade em dias: ");
		  dias= ler.nextInt();
		  
		  anos = dias / 365;
		  meses = (dias % 365) / 30;
		  resultado = (dias % meses);
		  
		  System.out.println("Sua idade: " + anos + " anos " + meses + " meses e " +  resultado + " dias");
	} 
  }
}
