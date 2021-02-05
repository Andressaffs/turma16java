package projetinho;

public class ClasseEstoque {

	protected int quantidade;
	protected String itens;
	
	
	public ClasseEstoque(int quantidade, String itens) {
		super();
		this.quantidade = quantidade;
		this.itens = itens;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public String getItem() {
		return itens;
	}


	public void setItem(String itens) {
		this.itens = itens;
	}
	
	
	
}
