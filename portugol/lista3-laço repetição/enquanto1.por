programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real numero=0.00, media=0.00, soma=0.00, quantidadeAlgarismo=0.00, somaTotal=0.00

	     escreva("Digite um número: ")
          leia(numero)

           enquanto (numero>0)
           {
           		
           	se (numero<0)
           	{

           		escreva("\nFim do Programa!")
           	}  	
           	senao se (numero>=0) 
           	{
           		escreva("Digite um número: ")
           		leia(numero)
               }	
               quantidadeAlgarismo++
           	somaTotal= somaTotal+numero
           	soma= soma + numero
           	media= somaTotal/quantidadeAlgarismo
           	
	    }
	          escreva("\nTotal de números somados: "+soma)
           	escreva("\nMédia total dos números: "+mat.arredondar(media, 2))
           	escreva("\nQuantidade de números lidos: "+quantidadeAlgarismo)
           	pula()
           	linha()
     }
     funcao pula()
     {
     	escreva("\n")
     }
     funcao linha()
     {
     	escreva("-----------------------------------------------")
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