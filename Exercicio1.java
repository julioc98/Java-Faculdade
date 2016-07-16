import javax.swing.JOptionPane;

public class Exercicio1 {

public static void main(String[] args) {

int i;

String saida = "";

for (i = 1; i <= 10; i++){

saida = saida + i + "\n";

}

JOptionPane.showMessageDialog(null, saida);

}

}
