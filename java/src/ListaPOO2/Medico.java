package ListaPOO2;

public class Medico extends L7Pessoa {

	private String crm;
	private String especialidade;
	private boolean redePublica;
	
	public Medico(String nome, String endereco, String telefone, String crm, String especialidade,
			boolean redePublica) {
		super(nome, endereco, telefone);
		this.crm = crm;
		this.especialidade = especialidade;
		this.redePublica = redePublica;
	}
	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public boolean isRedePublica() {
		return redePublica;
	}

	public void setRedePublica(boolean redePublica) {
		this.redePublica = redePublica;
	}
}
