programa
{
	
	funcao inicio()
	{
		//Elabore um programa que calcule o que deve ser pago por um produto, 
		//considerando o preço normal de etiqueta e a escolha da condição de pagamento.
		//Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado. 
         //Código Condição de pagamento 
        //1 À vista em dinheiro ou cheque, recebe 20% de desconto 
       //2 À vista no cartão de crédito, recebe 15% de desconto 
      //3 Em duas vezes, preço normal de etiqueta sem juros 
     //4 Em três vezes, preço normal de etiqueta mais juros de 10%
         real preco=0.00, pagamento=0.00, total=0.00

         
         escreva("Insira o valor total da compra: ")
         leia(preco)
         escreva("Escolha uma opção de pagamento: 1-cheque/à vista 2-à vista no crédito 3-2x s/juros 4-3x juros 10% ")
         leia(pagamento)

         se(pagamento==1)
         {
         	 total= preco - (preco * 0.20)
         }
         senao se (pagamento==2)
         {
         	 total= preco - (preco * 0.15)
         }
         senao se (pagamento==3)
         {
         	 total= preco/2
         }
         senao se (pagamento==4)
         {
         	total= (preco + (preco * 0.10))/3
         }

         escreva("O valor a ser pago é: ", total)      

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 678; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */