import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Veiculo veiculo = null;

        while (true) {
            
            System.out.println("=== Cadastro de Veículos ===");
            System.out.println("Escolha o tipo de veículo:");
            System.out.println("1 - Carro");
            System.out.println("2 - Moto");
            System.out.println("3 - Sair");
            int opcao = scanner.nextInt();

            String marca = getString("Marca:");
            String modelo = getString("Modelo:"); 
            Number ano = getNumero("Ano de fabricação:");
            if (ano instanceof Integer) {
                int inteiro = (Integer) ano;
            } else {
                double decimal = (Double) ano;
            }

            Number combustivel = getNumero("Quantidade de combustível:");
            if (combustivel instanceof Double) {
                double inteiro = (Double) combustivel;
            } else {
                int decimal = (Integer) combustivel;
            }
            scanner.close();
        }
    }

    private static String getString(String mensagem) {
        while (true) {
            try {
                System.out.println(mensagem);
                String input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    throw new IllegalArgumentException("O campo não pode ser vazio!");
                } 
                return input;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
        }
    }

    private static Number getNumero(String mensagem) {
        while (true) {
            try{
                System.out.println(mensagem);
                String input = scanner.nextLine().trim();

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
