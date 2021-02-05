package projetinho;

import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		try {

			System.out.println("Digite uma sequencia de nomes: ");
			String[] vetor = leia.nextLine().split(" "); // split � comando p dividir/separar/quebrar quando encontrar
															// um espa�o

			System.out.println("Digite uma posi��o da lista: ");
			int posicao = leia.nextInt();
			System.out.println("O nome na posi��o escolhida � " + vetor[posicao]);
		} 
		catch (java.lang.ArrayIndexOutOfBoundsException erro) {
			System.out.println("Digitou o indice errado");
		}

		catch (java.util.InputMismatchException erro) {
			System.out.println("Voc� precisa digitar n�meros!");
		}
		finally {
		      System.out.println("Voc� precisa prestar aten��o nas informa��es!");
		    }


		System.out.println("Fim do programa!");
	}
}
