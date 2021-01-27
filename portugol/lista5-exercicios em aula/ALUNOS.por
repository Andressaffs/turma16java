programa
{
	
	funcao inicio()
	{
		cadeia alunos[] = {"ALONSO MENDES SILVA DE OLIVEIRA","ANDRESSA FERREIRA DOS SANTOS","ATHOS GIOM DE PAIVA MESQUITA","CÂNDIDO JURELMO DOS SANTOS CAVALEIRO","CAROLINA GUIDA","DANIELE DOS SANTOS PINHEIRO","DÉBORA VIDEIRA MONTEIRO","DENILSON TEIXEIRA DE SOUZA","DENISE BRITO ANJOS","FELIPE CASAGRANDE TEIXEIRA DE CASTRO","FERNANDO BEDNARSKI RAMOS","FERNANDO DE BARROS SABALETE","GISELE DE OLIVEIRA PAZ","GUSTAVO DE SOUZA GUILHEN","GUSTAVO ESTEBAN CARRERAS JORGE","GUSTAVO LIMA DE SOUZA","IGOR MILHOMENS DOS SANTOS","JEAN PABLO CESARIO DA SILVA","JESSICA REGINA RODRIGUES HOLANDA","KAREN BERNARDI","KEWIN SOUTO BARROS","LEONARDO LIMA CINTRA","LEONARDO QUEIROZ BURJATO","LUCAS ALVES SCHIMIT","LUCAS DE BARROS PAIFAR","LUCAS LOIOLA DE ALMEIDA","MARCOS DOS SANTOS","MARIA NAZARE CORTEZ LIMA","MARIANA LIMA","MATHEUS RIBEIRO VILLELA","MAYARA CARDINOT MAFIOLETTI","MILTON JUNIOR CAVALCANTE DA PENHA","NATÃ DE ARAUJO GRECU","OSVALDO TAVARES VELASCO","PAOLA ALENCAR LISBOA","RAPHAEL EUZÉBIO SCAZITI","RENATO ANDRÉ NASCIMENTO SILVA","RUI ALMEIDA DE ANDRADE","TATIANE TISSONI ANTUNES","VICTOR DE MORAIS ARAUJO"}
          inteiro notas[40]
          cadeia matricula[40], tempMatricula, situacao
          caracter continua='s'
          


          escreva("Matricula \t\tAluno \n")

       	para(inteiro x=0; x<40; x++)
		{
			matricula[x]="G16-"+ (x+1)
			escreva(matricula[x],"\t\t", alunos[x],"\n")
		}
		enquanto(continua=='s' ou continua == 'S')
		{
			escreva("\nDigite a matricula do aluno desejado: ")
		leia(tempMatricula)
		para(inteiro x=0; x<40; x++)
		{
			se(tempMatricula == matricula[x])
			{
				escreva("Você selecionou o aluno ", alunos[x],". Qual a nota?[1-10] ")
				leia(notas[x])
				enquanto(notas[x] <0 ou notas[x] > 10)
				{
					escreva("Nota invalida, digite uma nota de 1 a 10")
					leia(notas[x])
				}
				escreva("Deseja cadastrar outra nota?[s/n]")
				leia(continua)
		      }
		
		}
		
		escreva("MATRICULA\tNOTAS\t\tSITUAÇÃO \t\t ALUNOS \n")

       	para(inteiro x=0; x<40; x++)
		{
			se(notas[x]<5 e notas[x]>0)
			{
				situacao="REPROVADO"
			}
			senao se(notas[x]>=5 e notas[x]<=8)
			{
				situacao="EM ANÁLISE"
			}
			senao se(notas[x]>8)
			{
				situacao= "APROVADO"
			}
			senao 
			{
				situacao= "NÃO AVALIADO"
			}
			matricula[x]="G16-"+ (x+1)
			escreva(matricula[x],"\t\t",notas[x],"\t\t",situacao,"\t\t", alunos[x],"\n")
          
	}
   }
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1977; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */