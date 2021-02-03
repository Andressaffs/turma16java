package exemplos;

import entidades.Classe;

public class ProgramaPrincipal {
	public static void main (String [] args)
	{
		Classe item1 = new Classe("Caixa de som ", 9 , 10.9);
		Classe item2 = new Classe("Fone de ouvido ", 2 , 5.9);
		
		System.out.println(item1.produto + item2.codigo+ item1.valorUnitario);
		System.out.println(item2.produto + item2.codigo);
		
	}
}
