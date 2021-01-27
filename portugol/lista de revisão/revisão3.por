programa
{
	
	funcao inicio()
	{
		//Escrever um programa que leia uma quantidade desconhecida de números e conte
		//quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. 
		//A entrada de dados deve terminar quando for lido um número negativo.
		real numero=0.00
		inteiro contador1=0, contador2=0, contador3=0, contador4=0

            escreva("Insira um número para iniciar o programa: ")
            leia(numero) 
            limpa()
          enquanto (numero>0)
          {
            escreva("Insira um número: ")
            leia(numero) 
          
            se(numero>=0 e numero<=25)
            {
          	contador1++
            }
            senao se(numero>=26 e numero<=50)
            {
          	contador2++
            }
            senao se (numero>=51 e numero<=75)
            {
          	contador3++
            }
            senao se(numero>=76 e numero<=100)
            {
          	contador4++
            }
          }
          

          escreva("\nO número de números repetidos entre 0-25 é: ",contador1)
          escreva("\nO número de números repetidos entre 26-50 é: ",contador2)
          escreva("\nO número de números repetidos entre 51-75 é: ",contador3)
          escreva("\nO número de números repetidos entre 76-100 é: ",contador4)
          escreva("\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1340; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */