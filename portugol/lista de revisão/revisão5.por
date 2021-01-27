programa
{
	
	funcao inicio()
	{ 
	     //Faça um programa que leia um vetor de 5 posições para números reais e,
		//depois, um código inteiro. Se o código for zero, finalize o programa; 
		//se for 1, mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa.
		//Caso, o código for diferente de 1 e 2, escreva uma mensagem informando que o código inválido.
		real vetor[5]
		inteiro codigo

		para (inteiro i=0; i<5; i++)
		{
		 	escreva("Digite um número: ")
		 	leia(vetor[i])
		 }
		     escreva("\nDigite 0-Finalizar 1-Ordem direta 2-Ordem inversa: ")
		     leia(codigo)

		se (codigo == 1) 
		{
		   escreva("\nOrdem direta:\n")
		  
		   para(inteiro i=0; i<5; i++)
		   escreva("\n",vetor[i])
		}
		se(codigo == 2)
		{
		   escreva("\nOrdem inversa:\n")
		  
		   para(inteiro i=5-1;i>=0;i--)
		   escreva("\n",vetor[i])
		}
		se(codigo == 0) 
		{
		   escreva("Fim do programa!")
		}	
		senao se(codigo < 0 e codigo > 2)
		{
		   escreva("Código inválido!")
		}		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 45; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */