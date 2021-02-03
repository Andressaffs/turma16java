package exemplos;

import java.util.Scanner;
import entidades.Pessoas;

public class CadAmigos {

	public static void main (String[] args)
	{
		Scanner leia = new Scanner (System.in);
		
		Pessoas broder1 = new Pessoas(null);
		
		System.out.println("Digite o nome: ");
		broder1.nome = leia.next();
		System.out.println("Digite M-masculino ou F-feminino: ");
		broder1.sexo=leia.next().toUpperCase().charAt(0);
		System.out.println("Digite o ano de nascimento [aaaa]: ");
		broder1.anoNascimento = leia.nextInt();
		
		System.out.printf("Oi %s, sua idade aproximada é %d!!",broder1.nome,broder1.idade);
		
	}
}
