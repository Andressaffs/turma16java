package listapoo3;

public class MainAnimal {
	
	public static void main (String[] args) {
		
	Cavalo cav = new Cavalo("Frodo",6);
	Cachorro dog = new Cachorro("Olaf",1);
	Preguiça preg = new Preguiça("Fifi",5);
	
	cav.movimento();
	cav.som();
	dog.movimento();
	dog.som();
	preg.movimento();
	preg.som();
		

	}
}
