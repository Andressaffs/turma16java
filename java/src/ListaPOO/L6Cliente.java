package ListaPOO;

import java.util.Scanner;

import entidades.Cliente;


public class L6Cliente {
	/*Crie uma classe cliente e apresente os atributos(estado do objeto) e m�todos(a��o) referentes esta classe, em
	 *  seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informa��es deste objeto no console.
	 */
	
	public static void main (String[] args)
	{
		Scanner leia = new Scanner (System.in);
		
		Cliente cliente1 = new Cliente();
		
		System.out.println("Digite o nome: ");
		cliente1.nomeCliente = leia.next();
		System.out.println("Digite M-masculino ou F-feminino: ");
		cliente1.sexo=leia.next().toUpperCase().charAt(0);
		System.out.println("Digite o ano de nascimento [aaaa]: ");
		cliente1.anoNascimento = leia.nextInt();
		System.out.println("J� tem o cadastro na loja? ");
		cliente1.cadastro = leia.next().toUpperCase().charAt(0);
		
		
		
		System.out.printf("\nOl� %s %s! Sua idade aproximada � %d!!\n %s",cliente1.sexo(),cliente1.nomeCliente,cliente1.idade(),cliente1.statusIdade());
		System.out.printf(cliente1.cadastroLoja());
	
		
		
		
		
		
		
		
	}
	
}
