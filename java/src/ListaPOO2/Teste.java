package ListaPOO2;

public class Teste {

	public void main (String[] args) {
	//EXERCICIO1------------------------------------------------------------------------------------------
	Medico med = new Medico("Julio","Rua das pedras","4002-8922","123456-SP","Geral",true);
	Paciente paciente1 = new Paciente("José","Rua das águas","9090-1234","Dor de cabeça","123456",5);
	
	
	med.setEspecialidade("Cardio");
	System.out.println(med.getEspecialidade());
	
	med.medicar();
	paciente1.remedio();
	
	//--------------------------------------------------------------------------------------------------------
	//EXERCICIO2
	Fornecedor fornecedor= new Fornecedor("Bia",1200.,1000.);
	
	System.out.printf("\nSaldo final: ", fornecedor.saldoFinal(),"\n");
	//--------------------------------------------------------------------------------------------------------
    //EXERCICIO3
	Empregado emp = new Empregado("Luiz",4240,2500,0.05);
	
	System.out.printf("\nEmpregado: %s ", emp.getNome());
	System.out.println("\nSalário: "+ emp.calcularSalario());
	//-------------------------------------------------------------------------------------------------------
	//EXERCICIO4
	Administrador adm = new Administrador("Carlos",500);
	
	System.out.println("\nAjuda de custo: "+adm.getAjudaDeCusto());
	//---------------------------------------------------------------------------------------------------------
	//EXERCICIO5
	Operario op = new Operario("Henrique",500);
	
	System.out.printf("\nA comissão de %s é R$ %d ",op.getNome(),op.comissao());
	//---------------------------------------------------------------------------------------------------------
	//EXERCICIO6
	Vendedor vend= new Vendedor("Carla",1000);
	
	System.out.printf("\nA comissão é %s é R$ %d ",vend.getNome(),vend.comissao());
	
    
	
	}
}
