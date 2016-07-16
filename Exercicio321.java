
// import javax.swing.JOptionPane; 
    public class Exercicio321{   

    	public static void main(String[] args) {
            String ax;

            for (int c =1; c<=20  ; c++) {
                ax = " "+fib(c);
                EntradaSaida.exibeMsg("isso aqui: "+ax);
                
            }
         
        }// fim do main 

        public static int fib (int x ) {
  			int aux = 0;
  			
            if (x==1 || x==2) {
                aux = 1;
            }else{
                if (x>2) {
                aux = (fib(x-1)) + (fib(x-2)); 
                }
            }
            return aux ;

    	} 

}// fim da class
