import javax.swing.JOptionPane;

public class Switch {
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o número:"));
        switch (dia) {
            case 1:
            JOptionPane.showMessageDialog(null, "Domingo");
            break;

            case 2:
            JOptionPane.showMessageDialog(null, "Segunda");
            break;

            case 3:
            JOptionPane.showMessageDialog(null, "Terça");
            break;

            case 4:
            JOptionPane.showMessageDialog(null, "Quarta");
            break;

            case 5:
            JOptionPane.showMessageDialog(null, "Quinta");
            break;

            case 6:
            JOptionPane.showMessageDialog(null, "sexta");
            break;

            case 7:
            JOptionPane.showMessageDialog(null, "Sábado");
            break;

            default:
                JOptionPane.showMessageDialog(null, "Digite um número entre 1 e 7!");
                break;
        }
    }
}
