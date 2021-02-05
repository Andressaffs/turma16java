package projetinho;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exemplo {
	
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		List  <Funcionario> lista = new ArrayList<>();//fazer lista
		//List - interface
		
		String nome;
		int matricula;
		int horas;
	    double valorHora;
	    double acrescimo;
	    char SN;
	    
	    System.out.println("Digite o numero de empregados");
		int numero = leia.nextInt();
	    
	  
	    
	    for(int x=1;x<=numero; x++)
	    {
	    	System.out.println("Digite seu número de matricula: ");
	    	matricula=leia.nextInt();
	    	System.out.println("Digite seu nome: ");
	    	nome=leia.nextLine();
	    	System.out.println("É terceiro? S-sim/N-não ");
	 	    SN=leia.next().toUpperCase().charAt(0);
	    	System.out.println("Digite suas horas: ");
	    	horas=leia.nextInt();
	    	System.out.println("Digite o valor por hora: ");
	    	valorHora=leia.nextDouble();
	    	
	    	if (SN == 'S')
			{
				System.out.println("Digite o valor do acrescimo : ");
			    acrescimo = leia.nextDouble();
				lista.add(new Terceiro(nome, matricula, horas, valorHora, acrescimo));
				
			}
			else if (SN =='N')
			{
				lista.add(new Funcionario(nome, matricula, horas, valorHora));
			}
		}
	    
	    System.out.println();
		System.out.println("PAGAMENTOS:");
		for (Funcionario emp : lista) 
		{
			System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.salario()));
		}
	    
	    //lista.add
		
	}

}
