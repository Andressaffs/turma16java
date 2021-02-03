package ListaPOO;

import entidades.ProdutoEletronico;

public class L6ProdutoEletronico {

	public static void main(String[] args) {
		ProdutoEletronico item = new ProdutoEletronico("Fone de ouvido", " 1 metro de fio", 19.9, 5);

		System.out.println("ITEM \t\t DETALHES \t\t PREÇO \t\t PESO(g) ");
		System.out.printf(item.produto + "\t" + item.especificacoes + "\t\t " + item.preco + "\t\t " + item.preco);

	}

}
