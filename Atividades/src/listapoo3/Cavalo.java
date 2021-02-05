package listapoo3;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade) {
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

	
/*	public void som(String som) {
	System.out.println("O cavalo relinchou");
	}

	public void movimento(String movimento) {
		System.out.println("O cavalo cavalgou");
	}*/

	@Override
	public void som() {
		// TODO Auto-generated method stub
		System.out.println("O cavalo relinchou");
	}

	@Override
	public void movimento() {
		// TODO Auto-generated method stub
		System.out.println("O cavalo cavalgou");
	}

	
}
