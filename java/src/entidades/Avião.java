package entidades;

public class Avi�o {
	//Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, 
	//em seguida crie um objeto avi�o, defina as instancias deste objeto e
	//apresente as informa��es deste objeto no console.
	
	
	public String modeloAvi�o;
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
			aviso="O avi�o est� parado";
		}
		else if(velocidadeAtual>0 && velocidadeAtual < velocidadeMaxima)
		{
			aviso="O avi�o est� abaixo do limite m�ximo";
		}
		else if(velocidadeAtual > velocidadeMaxima)
		{
			aviso="O avi�o est� acima do limite m�ximo";
		}
		else
		{
			aviso=" ";
		}
		return aviso;
	}
	
	
	
}
