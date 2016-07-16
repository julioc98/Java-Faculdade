
// import javax.swing.JOptionPane; 
    public class Exercicio317{   

    	public static void main(String[] args) {
            String nome; 
            String a , b;

            a = EntradaSaida.leCadeia("Digite o primeiro numero: ");
            b = EntradaSaida.leCadeia("Digite o segundo numero:");
            Troca(a,b);
         
        }// fim do main 

        public static void Troca (String x , String y ) {
  			String aux;
  			aux = x;
			x = y;
			y = aux;

			EntradaSaida.exibeMsg("O primeiro numero agora e: "+x+"\n O segundo numero agora e: "+y);
    
    	} 

}// fim da class
