package projetinho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Estoque1 {

	public static void main(String[] args) {
		
		Collection <String> produtos = new ArrayList();
		//adicionar dados
		produtos.add("�gua");
		produtos.add("Suco");
		produtos.add("Refri");
		produtos.add("Ch�");
		produtos.add("Caf�");
		
		System.out.println("Lista de produtos: "+produtos);
		//remover dados
		produtos.remove("Refri");
		System.out.println("Lista de produtos: "+produtos);
		//limpar lista
	//	produtos.clear();
	//	System.out.println("Lista de produtos: "+produtos);
		//cont�m
		System.out.println("Tem caf�? "+produtos.contains("Caf�"));
		System.out.println("Lista de produtos: "+produtos);
		
		//juntar listas
		
		Collection <String> produtos2 = Arrays.asList("Leite","Chocolate");
		produtos.addAll(produtos2);
		
		System.out.println("Lista de produtos: "+produtos);
		
	}
}
