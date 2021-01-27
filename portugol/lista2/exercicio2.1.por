programa
{
	
	funcao inicio()
	{
	real P, M, E

	escreva("Quantos quilos de tomate:")
	leia(P)


	E = P-50
	M= E* 4.00

	se(P>50)
	{
	  escreva("Sua multa é de: "+M+" reais e seu excesso é de: "+E+ " quilos") 	
	}
	senao
	{
		se(P<=50)
		{
			escreva("O valor é a ser pago é 0")
		}		
	}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 230; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */