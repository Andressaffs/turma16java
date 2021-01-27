programa
{
	
	funcao inicio()
	{
	 real indice
	 inteiro industria

	 escreva("Insir o número do seu grupo: ")
	 leia(industria)
	 escreva("Insir o seu índice: ")
	 leia(indice)

	 se(indice>= 0.3 e indice < 0.4)
       {
       	escreva("\nÍndice =  "+indice+". O primeiro grupo deve suspender suas atividades!")
       	
       }
       senao se(indice>= 0.4 e indice < 0.5)
       {
       	escreva("\nÍndice =  "+indice+". O primeiro e segundo grupo devem suspender suas atividades!")
       }
       senao se(indice>= 0.5)
       {
       	escreva("\nÍndice =  "+indice+". Todos os grupos devem suspender suas atividades!")
       }
       senao se(indice>=0.05 e indice < 0.25)
       {
       	escreva("\n Índice =  "+indice+".\n Índice com valor aceitável")
       }
	 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 37; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */