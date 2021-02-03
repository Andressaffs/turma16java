package entidades;

public class Pessoas {

	//objetivo da classe -
	//atributos - classe smp começa pelos atributos 
	public String nome;	
	public char sexo;
	public int anoNascimento;
	public boolean estaViva;
	public int idade;
	
	//construtores - pedreiros da classe - tem o msm nome da classe

	/*public Pessoas(String nome) {
		this.nome= nome;
	}
*/
	public int idade() {
		return 2021 - anoNascimento;
	}
	
	public Pessoas(String nome) {
		super();
		this.nome = nome;
	}

	public Pessoas(boolean estaViva, String nome) {
		this.estaViva = estaViva;
		this.nome = nome;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
/*atributos
	public String nome;		
	public char sexo;
	public int anoNascimento;
	
	public int idade()
	{
		return 2021 - anoNascimento;
	}
	
	public String statusIdade()
	{
		int idade;
		String aviso;
		
		idade= 2021 - anoNascimento;
		
		if(idade<18)
		{
			aviso ="Você deve iniciar o curso no módulo teens";
		}
		else
		{
			aviso= "Você pode iniciar o curso no módulo que desejar";
		}
		return aviso;
	}
	
/*		public char sexo()
	{
		char sexo;
		
		
		if(sexo=='M')
		{
			sexo = "Sr.";
		}
		if(sexo=='f')
		{
			sexo = "Sra.";
		}
		return;
	}*/


//herança
//abstração
//delegação de responsabilidade
//segurança

	

//construtores


//sobrecarga

//encapsulamento

//metodos
//sobrecargas*

//overhide - parece nome de transformer
//sobrecarga da sobregarga - shit no limits
