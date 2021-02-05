package projetinho;

public final class Terceiro extends Funcionario{
	
	private double acrescimo;

	public Terceiro(String nome, int matricula, int horas, double valorHora, double acrescimo) {
		super(nome, matricula, horas, valorHora);
		this.acrescimo = acrescimo;
	}

	public double getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}

	@Override
	public double salario() {
		double salarioTerceiro;
		salarioTerceiro=super.horas*(super.valorHora+(super.valorHora*this.acrescimo));
		return salarioTerceiro;
	}
}
