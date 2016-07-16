// package JulioC;
import javax.swing.JOptionPane; // biblioteca JOptionPane;(obrigatorio)  
    public class HelloWorld { // declaração de classe  
          
        public static void main(String[] args) { // inicio do metodo principal "main"  
            String nome; // declaração da propriedade nome do tipo String  
            nome = EntradaSaida.leCadeia("Digite seu nome: ");//nome recebe a String digitada  
            if(nome.equals(null))// se o nome for nulo, sair do sistema, aki existe diferença entre linguagens!   
                System.exit(0);  
            else  
                EntradaSaida.exibeMsg("Hello World "+nome);//só a necessidade de 2 parametros!  
          
        }// fim do main 

        // public static String leCadeia (String msg) {
    
        //     String ent;
        //     ent = JOptionPane.showInputDialog ( msg );
        //     return ent;
        // // devolve um tipo String como resposta
        // }  // fim do método leCadeia 
        // public static  void  exibeMsg (String msg) {
        //     JOptionPane.showMessageDialog ( null, msg );
        // }    // fim do método exibeMsg
    // nesse código indiferente c vc digita o nome ou não a menssagem "Hello World" será exibida!  
    }  