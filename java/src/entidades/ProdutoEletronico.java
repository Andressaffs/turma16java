package entidades;

public class ProdutoEletronico {
	// Crie uma classe produto eletr�nico e apresente os atributos e m�todos
	// referentes esta classe,
	// em seguida crie um objeto produto eletr�nico, defina as instancias deste
	// objeto
	// e apresente as informa��es deste objeto no console.

	public String produto;
	public String especificacoes;
	public double preco;
	public double peso;

	public ProdutoEletronico(String produto, String especificacoes, double preco, double peso) {
		this.produto = produto;
		this.especificacoes = especificacoes;
		this.preco = preco;
		this.peso = peso;
	}

	/*
	 * public String Produto() { return produto; }
	 * 
	 * public void Produto(String produto) { this.produto=produto; }
	 * 
	 * public String especificacoes() { especificacoes= "1 metro de fio"; return
	 * especificacoes; }
	 */

}
