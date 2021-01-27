programa
{
	
	funcao inicio()
	{
		inteiro segundos, horas, minutos, resultado

		escreva("Digite os segundos: ")
		leia(segundos)
	     horas = segundos / 3600
	     minutos = (segundos % 3600) / 60
	     resultado = segundos % minutos

	     escreva("O evento teve: "+ horas + " horas " + minutos +" minutos e " + resultado + " segundos")

    
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */