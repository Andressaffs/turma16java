programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{    
		real base=0.00, altura=0.00, area=0.00

		escreva("Digite a base ")
		leia(base)
		escreva("Digite a altura: ")
		leia(altura)

		se(base>0 e altura>0)
		{
			area = (base*altura)/2
			escreva("A área do triângulo é: ",mat.arredondar(area,2))
		}
		senao
		{
			escreva("Você digitou um número negativo ou zero. Valor não aceito")
		}	
	}
	funcao linha()
	{
		escreva("---------------------------\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 78; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */