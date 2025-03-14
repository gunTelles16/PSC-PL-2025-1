// Importando o JOptionPane da biblioteca swing.
import javax.swing.JOptionPane;

public class Entrada_Joption {
    // Convertendo argumentos String para int por meio do parse.
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String idade = JOptionPane.showInputDialog("Digite sua idade: ");

        int idadeStr = Integer.parseInt(idade);

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));

        JOptionPane.showMessageDialog(null, "Meu nome é " + nome + ", tenho " +  idadeStr + " anos e tenho " + altura + " m.");
    }
}