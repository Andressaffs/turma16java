package ListaPOO2;

public class Paciente extends L7Pessoa{

	private String sintoma;
	private String numeroSUS;
	private int numeroEspera;
	
	public Paciente(String nome, String endereco, String telefone, String sintoma, String numeroSUS, int numeroEspera) {
		super(nome, endereco, telefone);
		this.sintoma = sintoma;
		this.numeroSUS = numeroSUS;
		this.numeroEspera = numeroEspera;
	}
	public String getSintoma() {
		return sintoma;
	}

	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}

	public String getNumeroSUS() {
		return numeroSUS;
	}

	public void setNumeroSUS(String numeroSUS) {
		this.numeroSUS = numeroSUS;
	}

	public int getNumeroEspera() {
		return numeroEspera;
	}

	public void setNumeroEspera(int numeroEspera) {
		this.numeroEspera = numeroEspera;
	}	
}
