package projetinho;

public class Funcionario {

	private String nome;
	private int matricula;
	protected int horas;
	protected double valorHora;

	public Funcionario(String nome, int matricula, int horas, double valorHora) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.horas = horas;
		this.valorHora = valorHora;
	}

	public Funcionario(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}


	public int getHoras() {
		return horas;
	}


	public double getValorHora() {
		return valorHora;
	}
	//metodo
	public double salario() {
		double salario;
		salario=this.valorHora*this.horas;
		return salario;
	}

}
