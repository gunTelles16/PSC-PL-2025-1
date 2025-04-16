import java.util.HashMap;
import java.util.Scanner;

public class Locadora {
    private HashMap<String, Veiculo> veiculos;

    private static Scanner scanner = new Scanner(System.in);

    public Locadora() {
        this.veiculos = new HashMap<>();
    }

    private Sedan criarSedan() {
        System.out.println("=== Cadastro de Sedan ===");
        String marca = getString("Marca:");
        String modelo = getString("Modelo:");
        int ano = (int) getNumero("Ano de fabricação:");
        double combustivel = (double) getNumero("Quantidade de combustível:");
        int numeroPortas = (int) getNumero("Número de portas:");
        boolean arCondicionado = getBoolean("Ar condicionado (true/false):");
        boolean bancoDeCouro = getBoolean("Banco de couro (true/false):");
        boolean pilotoAutomatico = getBoolean("Piloto automático (true/false):");
        return new Sedan(marca, modelo, ano, false, 0.0, combustivel, numeroPortas, 
            arCondicionado, bancoDeCouro, pilotoAutomatico);
    }

    private static String getString(String mensagem) {
        while (true) {
            try{
                System.out.println(mensagem);
                String input = scanner.nextLine().trim().toLowerCase();

                if (input.isEmpty()) {
                    throw new IllegalArgumentException("O campo não pode ser vazio!");
                }
                return input;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }
        }
    }

    private static Number getNumero(String mensagem) {
        while (true) {
            try {
                System.out.println(mensagem);
                String input = scanner.nextLine().trim().toLowerCase();

                if (input.isEmpty()) {
                    throw new IllegalArgumentException("O campo não pode ser vazio!");
                } else {
                    double numero = Double.parseDouble(input);

                    if (numero == (int) numero) {
                        return (int) numero;
                    } else {
                        return numero;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido! Tente novamente.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }
        }
    }

    private static boolean getBoolean(String mensagem) {
        while (true) {
            try {
                System.out.println(mensagem);
                String input = scanner.nextLine().trim().toLowerCase();

                if (input.isEmpty()) {
                    throw new IllegalArgumentException("O campo não pode ser vazio!");
                }

                if (input.equalsIgnoreCase("Sim")) {
                    return true;
                } else if (input.equalsIgnoreCase("Não")) {
                    return false;
                } else {
                    throw new IllegalArgumentException("Por favor, digite 'Sim' ou 'Não'!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }
        }
    }
}
