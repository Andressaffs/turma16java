programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro A, B, C, D, R, S

		escreva("Digite o valor de A: ")
		leia(A)
		escreva("Digite o valor de B: ")
		leia(B)
		escreva("Digite o valor de C: ")
		leia(C)
		//onde:
		//d = r + s / 2
		R = (mat.potencia(A + B,2))
		S = (mat.potencia(B + C,2))
		D = R + S / 2

		escreva("d é igual a: "+ D)
		
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 372; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */