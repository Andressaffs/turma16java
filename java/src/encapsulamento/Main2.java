package encapsulamento;

public class Main2 {

	public static void main(String[] args) {
		Classe1 camiseta = new Classe1("Algod�o","Manga longa","Alta","Florido","Nike","Verde");
		Classe2 calca= new Classe2("Jeans","Classica","Grande",true,"Adidas","Azul");
     
		
		camiseta.vestir();
		
		calca.setBolso("pequeno");
		System.out.println(calca.getBolso());
	}

}
