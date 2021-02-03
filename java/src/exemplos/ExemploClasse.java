package exemplos;

import entidades.Pessoas;

public class ExemploClasse {

	public static void main(String[] args) {
		Pessoas cliente1 = new Pessoas("Jean Cesario" + false);
		Pessoas cliente2 = new Pessoas("Paola Alencar" + true);
		Pessoas cliente3 = new Pessoas("Elon Musk" + true);

		if (cliente1.estaViva) {
			System.out.println("Está vivo");
		} else {
			System.out.println("Sei lá mds!");
		}

	}
}
