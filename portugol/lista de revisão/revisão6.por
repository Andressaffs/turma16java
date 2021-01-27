programa
{
	
	funcao inicio()
	{
	//Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3 elementos.
	//Em seguida o programa deve fazer a multiplicação do vetor pelas colunas da matriz.

	   inteiro matriz[3][3], vetor[3], multiplicacao=0

	   para (inteiro i=0; i<3; i++) 
	   {
	       escreva("Insira os valores do vetor: ")
		  leia(vetor[i])
	   }
	   para (inteiro i=0; i<3; i++) 
	   {
		para (inteiro j=0; j<3; j++)
		{
		    escreva("Insira os valores da matriz: ")
	         leia(matriz[i][j])
		}
	   }
	   para (inteiro i = 0; i <3; i++)
	   {
		para(inteiro j = 0; j <3; j++)
		{
			multiplicacao = matriz[i][j] * vetor[i]
			escreva("[ ",multiplicacao, " ]")
		}
		escreva("\n")
	   }
          escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 687; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 9, 12, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */