package entidades;

public class Classe {

	public String produto;
	public int codigo;
	public double valorUnitario;

	public Classe(String produto, int codigo, double valorUnitario) {
		this.produto = produto;
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
	}

	public Classe(String produto, double valorUnitario) {
		super();
		this.produto = produto;
		this.valorUnitario = valorUnitario;
	}

	public Classe(String produto) {
		super();
		this.produto = produto;
	}

}
