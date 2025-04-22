import java.util.HashMap;
import java.util.Scanner;

public class Locadora {
    private HashMap<String, Veiculo> veiculos;
    private static Scanner scanner = new Scanner(System.in);

    public Locadora() {
        this.veiculos = new HashMap<>();
    }

    public Veiculo adicionarVeiculo() {
        System.out.println("=== Cadastro de Veículos ===");
        String placa = getString("Placa:");
        String tipo = getString("Tipo (Carro, Moto):");

        Veiculo veiculo = null;

        if (!tipo.equalsIgnoreCase("Carro") && !tipo.equalsIgnoreCase("Moto")) {
            throw new IllegalArgumentException("Tipo inválido! Digite 'Carro' ou 'Moto'.");
        }

        if (tipo.equalsIgnoreCase("Carro")) {
        String subtipo = getString("Tipo de carro (Sedan ou SUV):");

            if (!subtipo.equalsIgnoreCase("Sedan") && !subtipo.equalsIgnoreCase("SUV")) {
                throw new IllegalArgumentException("Tipo de carro inválido! Digite 'Sedan' ou 'SUV'.");
            }

            if (subtipo.equalsIgnoreCase("Sedan")) {
                veiculo = criarSedan();
            } else if (subtipo.equalsIgnoreCase(subtipo)) {
                veiculo = criarSUV();
            }
        } else if (tipo.equalsIgnoreCase("Moto")) {
            veiculo = criarMoto();
        }

        veiculos.put(placa, veiculo);
        return veiculo;
    }

    public Moto criarMoto() {
        System.out.println("=== Cadastro de Moto ===");
        String marca = getString("Marca:");
        String modelo = getString("Modelo");
        int ano = (int) getNumero("Ano de fabricação:");
        double combustivel = (double) getNumero("Quantidade de combustível:");
        boolean temCarenagem = getBoolean("Carenagem (Sim/Não):");
        boolean partidaEletrica = getBoolean("Partida elétrica (Sim/Não):");
        
        return new Moto(marca, modelo, ano, false, 0.0, combustivel, temCarenagem, partidaEletrica);
    }

    public Sedan criarSedan() {
        System.out.println("=== Cadastro de Sedan ===");
        String marca = getString("Marca:");
        String modelo = getString("Modelo:");
        int ano = (int) getNumero("Ano de fabricação:");
        double combustivel = (double) getNumero("Quantidade de combustível:");
        int numeroPortas = (int) getNumero("Número de portas:");
        boolean arCondicionado = getBoolean("Ar condicionado (true/false):");
        boolean bancoDeCouro = getBoolean("Banco de couro (true/false):");
        boolean pilotoAutomatico = getBoolean("Piloto automático (true/false):");
        
        return new Sedan(marca, modelo, ano, false, 0.0, combustivel, numeroPortas, arCondicionado, bancoDeCouro, pilotoAutomatico);
    }

    public SUV criarSUV() {
        System.out.println("=== Cadastro de SUV ===");
        String marca = getString("Marca:");
        String modelo = getString("Modelo:");
        int ano = (int) getNumero("Ano de fabricação:");
        double combustivel = (double) getNumero("Quantidade de combustível");
        int numeroPortas = (int) getNumero("Número de portas:");
        boolean arCondicionado = getBoolean("Ar condicionado");
        boolean tracao4x4 = getBoolean("Tração 4x4 (Sim/Não):");
        boolean pilotoAutomatico = getBoolean("Piloto automático (Sim/Não):");
        
        return new SUV(marca, modelo, ano, false, 0.0, combustivel, numeroPortas, arCondicionado, tracao4x4, pilotoAutomatico);
    }

    public HashMap<String, Veiculo> getVeiculos() {
        return veiculos;
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

                if (input.equals("Sim")) {
                    return true;
                } else if (input.equals("Não")) {
                    return false;
                } else {
                    throw new IllegalArgumentException("Por favor, digite 'Sim' ou 'Não'!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
