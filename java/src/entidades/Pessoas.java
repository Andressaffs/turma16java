package entidades;

public class Pessoas {

	//objetivo da classe -
	//atributos - classe smp come�a pelos atributos 
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
			aviso ="Voc� deve iniciar o curso no m�dulo teens";
		}
		else
		{
			aviso= "Voc� pode iniciar o curso no m�dulo que desejar";
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


//heran�a
//abstra��o
//delega��o de responsabilidade
//seguran�a

	

//construtores


//sobrecarga

//encapsulamento

//metodos
//sobrecargas*

//overhide - parece nome de transformer
//sobrecarga da sobregarga - shit no limits
