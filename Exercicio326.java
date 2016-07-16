/*
Crie uma função para ler dois vetores de números inteiros, cada um com 30 posições. 
Crie uma segunda função que receba os vetores criados pela primeira função e 
crie um terceiro vetor onde cada valor é a soma dos valores contidos nas posições 
respectivas dos vetores originais. Imprima depois os três vetores.
*/
public class Exercicio326{   

    	public static void main(String[] args) {
            // int vetP1[] = new int[3];
            int vetP2[] = new int[3];
            int vetP3[] = new int[3];
            String saida1=" ", saida2=" ", saida3=" ";

            int vetP1[] = criaVetDois("1");
            vetP2 = criaVetDois("2");
            vetP3 = criaVetMaster(vetP1,vetP2);

            for (int cont = 0;cont <3 ; cont++ ) {
            	saida1 += vetP1[cont]+",";
            	saida2 += vetP2[cont]+",";
            	saida3 += vetP3[cont]+",";

            }

            EntradaSaida.exibeMsg("Vetor 1: "+saida1+"\nVetor 2: "+saida2+"\nSoma dos vetores: "+saida3); 



        }// fim do main 

        public static int[] criaVetDois ( String nameNum) {
  			int vet[] = new int[3];
            // int vet2[] = new int[3];
            
  			for (int i = 0; i<3 ; i++ ) {
            	vet[i] = EntradaSaida.leInteiro("Digite "+(i+1)+" numero do vetor "+nameNum+": ");		
  			}
            

            return  vet;          
    
    	}
    	public static int[] criaVetMaster (int[] x , int[] y) {
  			int vetM[] = new int[3];
            // int vet2[] = new int[3];
            
  			for (int i = 0; i<3 ; i++ ) {
            	vetM[i] = (x[i] + y[i]);		
  			}
            	

            return  vetM;          
    
    	} 

}// fim da class