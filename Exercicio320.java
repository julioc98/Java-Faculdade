// import javax.swing.JOptionPane; 
    public class Exercicio320{   

    	public static void main(String[] args) {
            double num[] = new double[5]; 
            

            num[0] = EntradaSaida.leReal("Digite o primeiro numero: ");
            num[1] = EntradaSaida.leReal("Digite o segundo numero:");
            num[2] = EntradaSaida.leReal("Digite o terceiro numero:");
            num[3] = EntradaSaida.leReal("Digite o segundo numero:");
            num[4] = EntradaSaida.leReal("Digite o terceiro numero:");
            MaiorMenor(num[0],num[1],num[2],num[3],num[4]);
         
        }// fim do main 

        public static void MaiorMenor (double x , double y, double z, double a, double b ) {
  			double aux = 0, auxnum[] = new double[5];
            
  			auxnum[0] = x ;
			auxnum[1] = y;
			auxnum[2] = z;
            auxnum[3] = a;
            auxnum[4] = b;

            for (int i = 0; i < 4 ; i++) {

                if (auxnum[i] > auxnum[(i+1)]) {
                    aux = auxnum[i];
                    auxnum[i] = auxnum[(i+1)];
                    auxnum[(i+1)] = aux;
                }
                
            }

                

			EntradaSaida.exibeMsg("O numero segundo maior e: "+auxnum[3]+"\nO numero quarto maior e: "+auxnum[1]);
    
    	} 

}// fim da class