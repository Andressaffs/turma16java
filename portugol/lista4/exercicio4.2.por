programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro lancamentos[10]//vetor criado e esta vazio
		real somatorio=0.00, media=0.00
		inteiro maiorValor=0
		inteiro contador=0

		para(inteiro x=0; x<10; x++)
		{
			lancamentos[x]= Util.sorteia(1,6)
			somatorio = somatorio+lancamentos[x]
			se(lancamentos[x] >= maiorValor)
			{
				se (lancamentos[x] == maiorValor)
				{
					contador++
				}
				senao
				{
					contador=1
				}
				maiorValor=lancamentos[x]
			}
					
		}
		//aqui eu vou imprimir os numeros na tela
		para (inteiro x=0; x<10; x++)
		{
			escreva("Lançamento ",(x+1),"° é igual a ",lancamentos[x],"\n")
		}
		media=somatorio/10
		escreva("\nA soma dos valores é ",somatorio,"\n")
		escreva("A média é ",media,"\n")
		escreva("Maior valor ",maiorValor,"\n")
		escreva("O maior valor repetiu ",contador++," vezes\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 851; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */