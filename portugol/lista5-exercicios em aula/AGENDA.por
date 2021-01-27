programa
{
	
	funcao inicio()
	{
		//variaveis
		cadeia agenda[24][31]
		cadeia nome
		inteiro dia=0, hora=0
		caracter opcao='s'
		logico reiniciar=verdadeiro
          //aqui vai ter o inicio do loop
      faca
      {   
      	escreva("Bom dia! Insira seu nome: ")
		leia(nome)
		
       faca
       {
           	
         escreva("Escolha um dia [1][31]: ")
         leia(dia)
         escreva("Selecione a hora do seu evento [0/23]: ")
         leia(hora)
       enquanto(opcao == 's')
       {
	  enquanto( dia<=0 ou dia >31)
	  {
	    escreva("\nData informada incorreta, escolha uma data entre 1 e 31: ")
	    leia(dia)//saida do loop	       
	  }
	  dia-=1 //ajuste para ajustar o estouro da matriz
	  enquanto (hora<0 ou hora > 23)
	  {
	    escreva("\nHora informada incorreta, escolhe entre 0 e 23h: ")
	    leia(hora)
       }   
         escreva("\nInforme seu evento: ")
	    leia(agenda[hora][dia])
	    escreva("Deseja continuar s-sim n-não\n ")
	    leia(opcao)
       }
      
	  }
	   enquanto(opcao =='s')
         
           para(inteiro x= 0; x<31; x++)
            {
	          para(inteiro y=0; y<24;y++)
		      {
			   se (agenda[y][x] != "")
			    {
				 escreva("\n Olá " , nome, "! Dia ", x+1, " às ", y, "h você tem: ",agenda[y][x])	
			    } 
            
                }
           }      
               escreva("\nDeseja reiniciar o programa? S/N: ")
		 	leia(opcao)
		 	se (opcao == 's'){
		 		reiniciar = verdadeiro
		 	}
			senao
			{
				reiniciar =falso
			}
            } enquanto (reiniciar == verdadeiro) //entender pq o meu n aparece a data dnv
      
   }
} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1599; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */