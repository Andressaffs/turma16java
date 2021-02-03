package ListaPOO2;

public class L7Pessoa {

	private String nome;
	private String endereco;
	private String telefone;

	public L7Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public L7Pessoa() {
		
	}
	
	
	public void medicar() {
		System.out.println("O médico receitou remédio");
	}
	
	public void remedio() {
		System.out.println("O paciente tomou o remédio");
	}
	
	public String getNome() {
		return nome;
	}
  
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
