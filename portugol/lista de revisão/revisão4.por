programa
{
	
	funcao inicio()
	{

	real divisor=0.0, dividendo=-1.00, soma=0.0, div=0.0

	para (inteiro i=1; i<=50; i++) 
	{
	  escreva("\n",(2*i-1),"/",i)
	}
	para (dividendo=-1.00; dividendo<100; dividendo++)
	{
		para (divisor=1.00; divisor<=50; divisor++)
		{
			dividendo += 2
			soma += dividendo/divisor
		}
	}
	  escreva("\nA soma total é: ",soma)
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