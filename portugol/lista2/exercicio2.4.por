programa
{
	
	funcao inicio()
	{
		inteiro numero, resultado

		escreva("Insira um número: ")
		leia(numero)

		resultado = (numero%2) 

		se (numero == 0)
		{
			escreva("Você digitou um número neutro")
		}
		senao
		{
			se(numero < 0)
			{
			escreva("\nDesculpe, não entendi!")
			}
			senao se( resultado == 0) 
			{
				escreva("Esse número é par")
			}
			senao se( resultado > 0) 
			{
				escreva("Esse número é impar")
			}
		}		
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