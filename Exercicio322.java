// import javax.swing.JOptionPane; 
   
    public class Exercicio322{   

    	public static void main(String[] args) {
            int n, val;
            n = EntradaSaida.leInteiro("Digite um numero: ");
            val = fat(n);
            if (val == -1) {
                EntradaSaida.exibeMsg("Impossivel calcular o fatorial de "+n);                
            }else{
                EntradaSaida.exibeMsg("O Fatorial de "+n+" eh "+val);               
            }          
         
        }// fim do main 

        public static int fat(int x ) {
  			int aux = 0;
  			
            if (x < 0 ) {
                aux = -1;
            }else if (x == 0) {
                aux = 1; 
    
            }else{
                aux = x * fat((x - 1));
            }

            return aux ;

    	} 

}// fim da class
