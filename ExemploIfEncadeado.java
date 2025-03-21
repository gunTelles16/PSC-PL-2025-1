import javax.swing.JOptionPane;

public class ExemploIfEncadeado {
    public static void main(String[] args) {
        double a1, a2, a3, soma;
        a1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da A1:"));
        a2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da A2:"));
        a3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da A3"));
        soma = a1 + a2 + a3;

        if (soma >= 70) {
        JOptionPane.showMessageDialog(null, "Aprovado!");       
        } else if (soma < 70 && soma > 60) {
            JOptionPane.showMessageDialog(null, "Recuperação!");
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado!");
        }
    }
}
