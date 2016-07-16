//package JulioC;
import javax.swing.JOptionPane;
public class EntradaSaida {

    // método estático que retorna um inteiro lido do usuário:
    public static int leInteiro (String msg) {

        String ent;
        int i=0;
        ent = JOptionPane.showInputDialog ( msg );
        i = Integer.parseInt( ent );
        return i;
        // devolve um tipo int como resposta
    }   // fim do método leInteiro

    // método estático que retorna um número real lido do usuário:
    public static double leReal (String msg) {

        String ent;
        ent = JOptionPane.showInputDialog ( msg );
        return Double.parseDouble( ent ); // devolve um tipo double como resposta
    }   // fim do método leReal

    // método estático que retorna um texto do usuário:
    public static String leCadeia (String msg) {
    
        String ent;
        ent = JOptionPane.showInputDialog ( msg );
        return ent;
    // devolve um tipo String como resposta
    }  // fim do método leCadeia

    // método estático que retorna um caractere do usuário:
    public static char leCaractere (String msg) {
        String ent;
        ent = leCadeia (msg); // chama a função leCadeia desta     
        return ent.charAt(0); // retorna o 1º caractere, ignora os 

    }   // fim do método leCaractere      

    public static  void  exibeMsg (String msg) {
        JOptionPane.showMessageDialog ( null, msg );
    }    // fim do método exibeMsg


}    // fim da classe EntradaSaida





    

