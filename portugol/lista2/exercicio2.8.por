programa
{
	
	funcao inicio()
	{
		real N

		escreva("Insira um número: ")
		leia(N)
		limpa()

		se(N>100)
		{
			escreva("Seu número é: "+N)
		}
		senao se(N<100)
		{
		     escreva("0")
		}
		pula()
		linha()
	}
	
	funcao linha()
		{
			escreva("___________________________________")
		}
     funcao pula()
         {
      	escreva("\n")
         }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 289; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */