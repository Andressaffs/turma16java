package Aula3;

public class Banco {//inicio
	public static void main (String [] args)
	{
		Scanner leia =new Scanner(System.in);
		
		do 
		{
			
		
		System.out.println("Ed & RAFA BANK");
		System.out.println("Aonde seu diheiro tem mais força");
		System.out.println("1- CONTA POUPANÇA \r\n"
				+ "2 - CONTA CORRENTE\r\n"
				+ "3 - CONTA ESPECIAL \r\n"
				+ "4 - CONTA EMPRESA\r\n"
				+ "5 - CONTA ESTUDANTIL\r\n"
				+ "6 - SAIR\r\n"
				+"");
		
		System.out.println("Digite o número da sua opcao: ");
		opcao = leia.next(). charAt(0);
		if(opcao=='6')
		{
			break;
		}
		
		
	} while(true);
	System.out.println("Obrigado, volte sempre!")
   }

}