package projetinho;

import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		try {

			System.out.println("Digite uma sequencia de nomes: ");
			String[] vetor = leia.nextLine().split(" "); // split é comando p dividir/separar/quebrar quando encontrar
															// um espaço

			System.out.println("Digite uma posição da lista: ");
			int posicao = leia.nextInt();
			System.out.println("O nome na posição escolhida é " + vetor[posicao]);
		} 
		catch (java.lang.ArrayIndexOutOfBoundsException erro) {
			System.out.println("Digitou o indice errado");
		}

		catch (java.util.InputMismatchException erro) {
			System.out.println("Você precisa digitar números!");
		}
		finally {
		      System.out.println("Você precisa prestar atenção nas informações!");
		    }


		System.out.println("Fim do programa!");
	}
}
