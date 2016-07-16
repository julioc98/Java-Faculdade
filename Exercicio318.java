// import javax.swing.JOptionPane; 
    public class Exercicio318{   

    	public static void main(String[] args) {
            double num[] = new double[3]; 
            

            num[0] = EntradaSaida.leReal("Digite o primeiro numero: ");
            num[1] = EntradaSaida.leReal("Digite o segundo numero:");
            num[2] = EntradaSaida.leReal("Digite o terceiro numero:");
            
            MaiorMenor(num[0],num[1],num[2]);
         
        }// fim do main 

        public static void MaiorMenor (double x , double y, double z ) {
  			double maior = 0, menor = 0, auxnum[] = new double[3];
            
  			auxnum[0] = x ;
			auxnum[1] = y;
			auxnum[2] = z;

            for (int i = 0; i < 2 ; i++) {

                if (auxnum[i] > auxnum[(i+1)]) {
                    maior = auxnum[i];
                }
                else{
                    menor = auxnum[i];
                }
            }


			EntradaSaida.exibeMsg("O numero maior e: "+maior+"\nO numero menor e: "+menor);
    
    	} 

}// fim da class