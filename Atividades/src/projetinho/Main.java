package projetinho;

public class Main {

	public static void main (String args[]) {
		Funcionario func = new Funcionario("Jo�o",13,44,30.0);
		Terceiro terc = new Terceiro("Jos�",12,50,30.0,15.0);
		
		
		System.out.printf("Funcionario: %s.\nSal�rio: %.2f",func.getNome(),func.salario());
		System.out.printf("\nFuncionario: %s.\nSal�rio: %.2f",terc.getNome(),terc.salario());
		
	}
}
