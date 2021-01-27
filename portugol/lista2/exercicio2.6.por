programa
{
	
	funcao inicio()
	{
		inteiro idade, resultado
		
		escreva("Insira sua idade: ")
		leia(idade)
		
		se(idade>18)
		{
			    escreva("Você é adulto")
		}
		
		senao se(idade>=14 e idade<=17)
		{
				escreva("Você é juvenil B")
		}
		senao se(idade>= 12 e idade<=13)
		{
				escreva("Você é juvenil A")
		}
		senao se(idade>=8 e idade <=11)
		{
				escreva("Você é infantil B")
		}	
		senao se (idade>=5 e idade<=7)
		{
				escreva("Você é infantil A")
		}
		senao se(idade<=4)
		{
				escreva("Não podemos atender")
		}

		escreva("\nObrigado, volte sempre!")
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 570; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */