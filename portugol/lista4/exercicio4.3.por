programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
//Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
       inteiro N1[4][6]
       inteiro N2[4][6]
       inteiro M1[4][6]
       inteiro M2[4][6]
       //entrada
       para(inteiro x=0; x<4; x++)
       {
       	para(inteiro y=0; y<4; y++)
       	{
       		N1[x][y]= Util.sorteia(1,10)
       		N2[x][y]= Util.sorteia(1,10)
       		M1[x][y]= N1[x][y]+N2[x][y]
       		M2[x][y]= N1[x][y]-N2[x][y]
       	}     	
       }
       //saida
      para(inteiro x=0; x<4; x++)
      {
        para (inteiro y=0; y<6; y++)
        {
        	
         escreva("[",N1[x][y], "]")
        }
      }
      escreva("\n")
  
       para(inteiro x=0; x<4; x++)
      {
        para (inteiro y=0; y<6; y++)
        {
         escreva("[",N2[x][y], "]")
        }
      }
      escreva("\n")
     
       para(inteiro x=0; x<4; x++)
      {
        para (inteiro y=0; y<6; y++)
        {
         escreva("[",M1[x][y], "]")
        }
      }
      escreva("\n")
      para(inteiro x=0; x<4; x++)
      {
        para (inteiro y=0; y<6; y++)
        {
         escreva("[",M2[x][y], "]")
        }
      }
      
      
   } 

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 833; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */