programa
{
	
	funcao inicio()
	{ 

        real custo, custoConsumidor


        escreva("Insira o custo de fábrica: ")
        leia(custo)

        //Custo de fábrica + 28% do distribuidor + 45% de impostos

        custoConsumidor= custo + (custo * 0.28) + (custo * 0.45)

        escreva("O custo para o consumidor é: "+ custoConsumidor)
        
        
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 173; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */