import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Locadora locadora = new Locadora();
        locadora.adicionarVeiculo();


        String opcao = getString("Deseja dirigir o veículo?");

        if (!opcao.equalsIgnoreCase("Sim") || !opcao.equalsIgnoreCase("Não")) {
            throw new IllegalArgumentException("Opção inválida! Digite 'Sim' ou 'Não'.");
        }

        if (opcao.equalsIgnoreCase("Sim")) {
            int menu = (int) getNumero("Escolha uma opção:\n 1 - LigarMotor \n2 - Exibir informações \n3 - Sair do veículo");

            if (menu != 1 || menu != 2 || menu != 3) {
                throw new IllegalArgumentException("Opção inválida! Tente novamente.");
            }
            
            if (menu == 1) {
                
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
