package projetinho;

public class Main {

	public static void main (String args[]) {
		Funcionario func = new Funcionario("João",13,44,30.0);
		Terceiro terc = new Terceiro("José",12,50,30.0,15.0);
		
		
		System.out.printf("Funcionario: %s.\nSalário: %.2f",func.getNome(),func.salario());
		System.out.printf("\nFuncionario: %s.\nSalário: %.2f",terc.getNome(),terc.salario());
		
	}
}
