package exemplos;

import java.util.Scanner;
import entidades.Pessoas;

public class CursoIngles {
	public static void main (String[] args)
	{
		Scanner leia = new Scanner (System.in);
		Pessoas aluno1 = new Pessoas("teste");
		
		System.out.println("Digite o nome: ");
		aluno1.nome = leia.next();
		System.out.println("Digite M-masculino ou F-feminino: ");
		aluno1.sexo=leia.next().toUpperCase().charAt(0);
		System.out.println("Digite o ano de nascimento [aaaa]: ");
		aluno1.anoNascimento = leia.nextInt();
		
		System.out.printf("Oi %s, sua idade aproximada é %d!!\n",aluno1.nome, aluno1.idade());
	
		
		
	}
}
