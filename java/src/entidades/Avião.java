package entidades;

public class Avião {
	//Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
	//em seguida crie um objeto avião, defina as instancias deste objeto e
	//apresente as informações deste objeto no console.
	
	
	public String modeloAvião;
	public String empresa;
	public int ano;
	public double velocidadeAtual;
	public double velocidadeMaxima;
	public String statusVelocidade;
	

	
	public String statusVelocidade()
	{
		String aviso;
		
		if (velocidadeAtual<=0)
		{
			aviso="O avião está parado";
		}
		else if(velocidadeAtual>0 && velocidadeAtual < velocidadeMaxima)
		{
			aviso="O avião está abaixo do limite máximo";
		}
		else if(velocidadeAtual > velocidadeMaxima)
		{
			aviso="O avião está acima do limite máximo";
		}
		else
		{
			aviso=" ";
		}
		return aviso;
	}
	
	
	
}
