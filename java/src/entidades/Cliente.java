package entidades;

public class Cliente {

	public String nomeCliente;
	public char sexo;
	public int anoNascimento;
	public char cadastro;

	public int idade() {
		return 2021 - anoNascimento;
	}

	public String statusIdade() {
		int idade;
		String aviso;

		idade = 2021 - anoNascimento;

		if (idade < 18) {
			aviso = "Você não pode fazer cadastro em nossa loja";
		} else {
			aviso = "";
		}
		return aviso;
	}

	public String sexo() {
		String mensagem = null;

		if (sexo == 'M') {
			mensagem = "Sr.";
		}
		if (sexo == 'F') {
			mensagem = "Sra.";
		}
		return mensagem;
	}

	public String cadastroLoja() {

		String mensagem = null;

		if (cadastro == 'S') {
			mensagem = "Você já tem cadastro na loja";
		} else if (cadastro != 'S') {
			mensagem = "Você precisa fazer o cadastro para continuar";
		}
		return mensagem;
	}
}
