import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Locadora locadora = null;

        while (locadora == null) {
            try{
                System.out.println("=== Cadastro de Veículos ===");
                String placa = getString("Placa:");
                String tipo = getString("Tipo (Carro, Moto):");

                Veiculo veiculo = null;

                if (!tipo.equalsIgnoreCase("Carro") || !tipo.equalsIgnoreCase("Moto")) {
                    throw new IllegalArgumentException("Tipo inválido! Digite 'Carro' ou 'Moto'.");
                }

                if (tipo.equalsIgnoreCase("Carro")) {
                    String subtipo = getString("Tipo de carro (Sedan ou SUV):");

                    if (!subtipo.equalsIgnoreCase("Sedan") || !subtipo.equalsIgnoreCase("SUV")) {
                        throw new IllegalArgumentException("Tipo de carro inválido! Digite 'Sedan' ou 'SUV'.");
                    }

                    if (subtipo.equalsIgnoreCase("Sedan")) {
                        veiculo = criarSedan();
                    } else if (subtipo.equalsIgnoreCase(subtipo)) {
                        veiculo = criarSUV();
                    }
                }

                if (tipo.equalsIgnoreCase("Moto")) {
                    veiculo = criarMoto();
                }

                String marca = getString("Marca:");
                String modelo = getString("Modelo:");

                int ano = (int) getNumero("Ano de fabricação:");

                double combustivel = (double) getNumero("Quantidade de combustível:");

                scanner.close();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }
        }
    }

    private static String getString(String mensagem) {
        while (true) {
            try {
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
            try{
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
}
