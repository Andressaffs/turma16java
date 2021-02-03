package encapsulamento;

public class Cachorro extends Animal{
	
	String raca;
	
	public Cachorro(String nome, String raca, double peso) {
		super(nome, peso);
		// TODO Auto-generated constructor stub
	}
    public void latir() {
    	System.out.println("O cachorro está latindo");
    }
	
	
}
