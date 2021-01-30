package Aulas;

import java.util.Scanner;

public class Banco {//inicio
		public static void main (String args[])
		{
			Scanner leia=new Scanner(System.in);
			char opcao;
			
			do 
			{
			System.out.println("And Bank");
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
			else if (opcao == '1') 
			{
				contaPoupanca();
			}
			
			
		} while(true);
		System.out.println("Obrigado, volte sempre!");
	   }
         public static void contaPoupanca()
         {
        	 Scanner tec = new Scanner(System.in);
        	 double saldo=0.00, saldoPoupanca = 0.00, credito=0.00, debito=0.00;
        	 char opcaoDC;
     		 char opcaoSN;
     		 String descricao;
     		 
        	 System.out.println("CONTA POUPANÇA");
        	 linha(40);
        	 //processos
        	 for(int giro=1; giro<=10; giro++)
        	 {
        		 System.out.printf("Lançamento %d: [D-débito/C-crédito]: ",giro);
        		 opcaoDC=tec.next().toUpperCase().charAt(0);//charAt cpega o que digitaa na primeira posicao e transforma em caracter toupper transforma em letra grande
        		 if(opcaoDC =='D')
        		 {
        			 System.out.println("\nDigite o valor para débito: ");
        			 debito=tec.nextDouble();
        			 if(saldo>0)
        			 {
        			  while(saldo<debito)
        			  {
        				 System.out.printf("Não é possível realizar a transação, tente de novo!\n ",saldo);
        				 System.out.println("Digite o valor para débito: ");
        				 debito=tec.nextDouble();
        				 
        			  }
        			  tec.nextLine();
        			  System.out.println("Digite a descrição do débito: ");
        			  descricao=tec.nextLine();		
        			  saldo=saldo-debito;
        			  System.out.printf("Saldo atual é R$ %d",saldo);
        			 }
        			 else if(saldo==0)
        			 {
        				 System.out.println("Você está sem saldo no momento, faça um crédito primeiro!");
        			 }
        		 }
        		 else if(opcaoDC=='C')
        		 {
        			 System.out.println("\nDigite o valor do crédito: ");
        			 credito=tec.nextDouble();
        			 while(credito<=0)
        			 {
        				 System.out.println("Valor informado negativo ou zero, tente de novo");
        			 }
        			 tec.nextLine();
        			 System.out.println("Digite a descrição do crédito: ");
        			 descricao=tec.nextLine();
        			 saldo=saldo+credito;
        			 System.out.printf("Saldo atual é R$ %2.f ",saldo);
        		 }
        		 else
        		 {
        			 System.out.println("Você não escolheu nenhuma das opções");
        		 }
        		 System.out.print("Continua S/N: ");
        		 opcaoSN=tec.next().toUpperCase().charAt(0);
        		 if(opcaoSN=='N')
        		 {
        			 break;
        		 }
        	 }
        	 //correção monetaria
        	 System.out.println("Deseja fazer a correção hoje? S/N ");
        	 opcaoSN=tec.next().toUpperCase().charAt(0);
        	 if(opcaoSN=='S')
        	 {
        		 saldo+=(saldo*0.0005);
        	 }
        	 System.out.printf("SALDO FINAL DA CONTA POUPANÇA %.2f",saldo);
        	 System.out.println();
        	 linha(40);
        	 
         }
         public static void linha (int tamanho)
         {
        	 for (int x=1; x<tamanho;x++)
        	 {
        		 System.out.print("=");
        	 }
        	 System.out.println();
         }
	}

