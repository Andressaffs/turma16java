package Lista3;

import java.util.Scanner;

public class L3Exercicio3 {
	public static void main(String[] args)
	{
		  Scanner ler = new Scanner (System.in);
		  int N1, N2, N3, N4, R1,R2,R3,R4;
		
		  System.out.print("Insira quatro números: ");
		  N1= ler.nextInt();
		  N2= ler.nextInt();
		  N3= ler.nextInt();
		  N4= ler.nextInt();
		
	      R1= (int) Math.pow(N1, 2);
	      R2= (int) Math.pow(N2, 2);
	      R3= (int) Math.pow(N3, 2);
	      R4= (int) Math.pow(N4, 2);
	 	   
	      if(R3>=1000)
	      {
	    	   System.out.println("O quadrado do terceiro é: "+R3);
	      }
	      else if(R3<1000)
	      {
	    	  System.out.println("O quadrado de "+N1+" é: "+R1+". O quadrado de "+N2+" é: "+R2+". O quadrado de "+N3+" é: "+R3+". O quadrado de "+N4+" é: "+R4);
	      }
	}

}
