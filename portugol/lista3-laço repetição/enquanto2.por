programa
{
	
	funcao inicio()
	{
	//Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três 
	//(imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário digita 5,
	//deveremos observar na tela a seguinte sequência: 5 15 45 135.
        real numero=0.00, resultado=0.00
        
        escreva("Digite um número: ")
	   leia(numero)
	   escreva("\nValor da multiplicação: "+numero)

	   enquanto(numero<=100)
	   {
	   	numero=numero*3  
	   	escreva("\nValor da multiplicação: "+numero)

	   }	
	   	   	se(numero>=100)
	   	{
	   		pula()
	   		linha()
	   		escreva("\nFIM")
	   	}
	   	pula()
	   	linha()
	}
	     funcao pula()
     {
     	escreva("\n")
     }
     funcao linha()
     {
     	escreva("-----------------------------------------------")
     }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 281; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */