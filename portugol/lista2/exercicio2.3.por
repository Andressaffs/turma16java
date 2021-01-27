programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
	  inteiro N1,N2,N3,N4,R1,R2,R3,R4
	
       
       escreva("Insira o primeiro número: ")
       leia(N1)
       escreva("Insira o segundo número: ")
       leia(N2)
       escreva("Insira o terceiro número: ")
       leia(N3)
       escreva("Insira o quarto número: ")
       leia(N4)
     

       R1= (mat.potencia(N1, 2))
       R2= (mat.potencia(N2, 2))
       R3= (mat.potencia(N3, 2))
       R4= (mat.potencia(N4, 2))
       limpa()


       se(R3>=1000)
       {
       	escreva("O quadrado do terceiro é: "+ R3)
       	
       }
       senao se (R3<1000)
       {
        escreva("O quadrado de "+N1+" é: "+R1+". O quadrado de "+N2+" é: "+R2+". O quadrado de "+N3+" é: "+R3+". O quadrado de "+N4+" é: "+R4)
       }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 514; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */