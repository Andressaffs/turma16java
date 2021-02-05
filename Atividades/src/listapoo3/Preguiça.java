package listapoo3;

public class Preguiça extends Animal {

	public Preguiça(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}

	@Override
	public int getIdade() {
		// TODO Auto-generated method stub
		return super.getIdade();
	}

	@Override
	public void setIdade(int idade) {
		// TODO Auto-generated method stub
		super.setIdade(idade);
	}

	@Override
/*	public void som(String som) {
		// TODO Auto-generated method stub
		super.som("A preguiça gritou");
	}

	@Override
	public void movimento(String movimento) {
		// TODO Auto-generated method stub
		super.movimento("A preguiça dormiu");
	}*/

	public void som() {
		// TODO Auto-generated method stub
		System.out.println("A preguiça dormiu");
	}

	@Override
	public void movimento() {
		// TODO Auto-generated method stub
		System.out.println("A preguiça dormiu"); 
	}

	
	
}
