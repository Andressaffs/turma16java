programa
{
	
	funcao inicio()
	{
		inteiro idade, anos, meses, dias, resultado

		escreva("Digite sua idade em dias: ")
		leia(dias)
		anos = dias / 365
		meses = (dias % 365) / 30
		resultado = dias % meses
		escreva("Sua idade: " + anos + " anos " + meses + " meses e " +  resultado + " dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 125; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */