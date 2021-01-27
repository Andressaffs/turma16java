programa
{
	
	funcao inicio()
	{
        real C, E, salario, salarioTotal, salarioExcedente
        inteiro N
        
         escreva("Insira seu código: ")
	    leia(C)
         escreva("Insira o número de horas trabalhadas:")
	    leia(N)
	    
	    E = N - 50
	    salario = N * 10.00
	    salarioExcedente = (N%50) * 20.00
	    salarioTotal = salario+salarioExcedente

	    se(N>50)
	    {

	    escreva("Seu salário excedente é de "+salarioExcedente+" reais.")
	    escreva("\nNo total você receberá: "+salarioTotal)
	    }
	    senao
	    {
	    	se(N<50)
	    	{
	    		escreva("Seu salário é de "+salario+" reais.")
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