// 19. Construa uma função que receba dois valores inteiros a e b, 
// retorne (passagem por referência) o quociente, div, e o resto divisão, mod,
 // de a pôr b. A função deve retornar -1 caso não seja possível realizar as 
// operações e 0 caso seja possível.
 // Um algoritmo para utilizar tal função deve ser criado, tratando o retorno da função.

// import javax.swing.JOptionPane; 
    public class Exercicio319{   

    	public static void main(String[] args) {
            int num[] = new int[2]; 
            

            num[0] = EntradaSaida.leInteiro("Digite o primeiro numero: ");
            num[1] = EntradaSaida.leInteiro("Digite o segundo numero:");
            
            if (divMod(num[0],num[1]) == 0) {
                EntradaSaida.exibeMsg("E divisivel");//só a necessidade de 2 parametros!  
                
            }else{
                EntradaSaida.exibeMsg("Nao e divisivel");//só a necessidade de 2 parametros!  

            }
         
        }// fim do main 

        public static int divMod (int x , int y ) {
  			int resut = 5;

            resut = x%y;

            if (y == 0 || resut!=0) {
                resut = -1;
            }

            return  resut;          
    
    	} 

}// fim da class