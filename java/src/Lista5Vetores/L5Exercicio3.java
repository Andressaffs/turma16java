package Lista5Vetores;

import java.util.Scanner;

public class L5Exercicio3 {
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		   
	       int N1[] []=new int [4][6];
	       int N2[] []=new int [4][6];
	       int M1[] []=new int [4][6];
	       int M2[] []=new int [4][6];
	       
	       for(int x=0; x<4; x++)
	       {
	       	 for(int y=0; y<6; y++)
	       	 {
	       		N1[x][y]= randomInt(0, 10);
	       		N2[x][y]= randomInt(0, 10);
	       		M1[x][y]= N1[x][y]+N2[x][y];
	       		M2[x][y]= N1[x][y]-N2[x][y];
	         }     	
	      }	    
		  for(int x=0; x<4; x++)
		  {
		     for(int y=0; y<6; y++)
		   	 {
					System.out.printf("\t"+N1[x][y]+"\t");
			 }	
		  }
		  System.out.print("\n");
		  for(int x=0; x<4; x++)
		  {
			  for(int y=0; y<6; y++)
			  {
					System.out.printf("\t"+N2[x][y]+"  ");
			  }	
		  }  
		  System.out.print("\n");
		  for(int x=0; x<4; x++)
		  {
			  for(int y=0; y<6; y++)
			  {
					System.out.printf("\t"+M1[x][y]+"  ");
			  }	
		  }
		  System.out.print("\n");
		  for(int x=0; x<4; x++)
		  {
			 for(int y=0; y<6; y++)
			  {
					System.out.printf("\t"+M2[x][y]+"  ");
			  }	
		  }
					
	}
	public static int randomInt(int min, int max) 
	{
        double x = (int)(Math.random()*((max-min)+1))+min;    
        int y = (int)x;
        return y;
    }
	
}
