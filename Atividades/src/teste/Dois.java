package teste;

public class Dois extends Um {
	

	private String rua;

	public Dois(String nome, String rua) {
		super(nome);
		this.rua = rua;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}
	
	

}
