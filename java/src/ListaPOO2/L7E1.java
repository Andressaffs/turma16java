package ListaPOO2;

public class L7E1 {

	public void main (String[] args) {
	Medico med = new Medico("Julio","Rua das pedras","4002-8922","123456-SP","Geral",true);
	Paciente paciente1 = new Paciente("Jos�","Rua das �guas","9090-1234","Dor de cabe�a","123456",5);
	
	
	med.setEspecialidade("Cardio");
	System.out.println(med.getEspecialidade());
	
	med.medicar();
	paciente1.remedio();
	
	}
}
