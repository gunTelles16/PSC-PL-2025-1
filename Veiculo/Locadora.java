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
        String tipo = getString("Tipo (Carro, Moto, Avião, Barco, Trem):");

        Veiculo veiculo = null;

        if (!tipo.equalsIgnoreCase("Carro") && !tipo.equalsIgnoreCase("Moto") && !tipo.equalsIgnoreCase("Avião")
                && !tipo.equalsIgnoreCase("Barco") && !tipo.equalsIgnoreCase("Trem")) {
            throw new IllegalArgumentException("Tipo inválido! Digite 'Carro'. 'Moto', 'Avião', 'Barco' ou 'Trem'.");
        }

        switch (tipo) {
            case "Carro" ->  {
                String subtipo = getString("Tipo de carro (Sedan ou SUV):");
                
                if (!subtipo.equalsIgnoreCase("Sedan") && !subtipo.equalsIgnoreCase("SUV")) {
                    throw new IllegalArgumentException("Tipo de carro inválido! Digite 'Sedan' ou 'SUV'.");
                }
                
                if (subtipo.equalsIgnoreCase("Sedan")) {
                    veiculo = criarSedan();
                } else if (subtipo.equalsIgnoreCase(subtipo)) {
                    veiculo = criarSUV();
                }
            }
            case "Moto" -> veiculo = criarMoto();
            case "Avião" -> veiculo = criarAviao();
            case "Barco" -> veiculo = criarBarco();
            case "Trem" -> veiculo = criarTrem();
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
        double limiteLitros = (double) getNumero("Limite do tanque de combustível:");
        boolean temCarenagem = getBoolean("Carenagem (Sim/Não):");
        boolean partidaEletrica = getBoolean("Partida elétrica (Sim/Não):");
        
        return new Moto(marca, modelo, ano, false, 0.0, combustivel, limiteLitros, 
            temCarenagem, partidaEletrica);
    }

    public Sedan criarSedan() {
        System.out.println("=== Cadastro de Sedan ===");
        String marca = getString("Marca:");
        String modelo = getString("Modelo:");
        int ano = (int) getNumero("Ano de fabricação:");
        double combustivel = (double) getNumero("Quantidade de combustível:");
        double limiteLitros = (double) getNumero("Limite do tanque de combustível:");
        int numeroPortas = (int) getNumero("Número de portas:");
        boolean arCondicionado = getBoolean("Ar condicionado (true/false):");
        boolean bancoDeCouro = getBoolean("Banco de couro (true/false):");
        boolean pilotoAutomatico = getBoolean("Piloto automático (true/false):");
        
        return new Sedan(marca, modelo, ano, false, 0.0, combustivel, limiteLitros,
            numeroPortas, arCondicionado, bancoDeCouro, pilotoAutomatico);
    }

    public SUV criarSUV() {
        System.out.println("=== Cadastro de SUV ===");
        String marca = getString("Marca:");
        String modelo = getString("Modelo:");
        int ano = (int) getNumero("Ano de fabricação:");
        double combustivel = (double) getNumero("Quantidade de combustível");
        double limiteLitros = (double) getNumero("Limite do tanque de combustível:");
        int numeroPortas = (int) getNumero("Número de portas:");
        boolean arCondicionado = getBoolean("Ar condicionado");
        boolean tracao4x4 = getBoolean("Tração 4x4 (Sim/Não):");
        boolean pilotoAutomatico = getBoolean("Piloto automático (Sim/Não):");
        
        return new SUV(marca, modelo, ano, false, 0.0, combustivel, limiteLitros,
            numeroPortas, arCondicionado, tracao4x4, pilotoAutomatico);
    }

    public Aviao criarAviao() {
        System.out.println("=== Cadastro de Avião ===");
        String marca = getString("Marca:");
        String modelo = getString("Modelo:");
        int ano = (int) getNumero("Ano de fabricação:");
        double combustivel = (double) getNumero("Quantidade de combustível:");
        double limiteLitros = (double) getNumero("Limite do tanque de combustível:");

        return new Aviao(marca, modelo, ano, false, 0.0, combustivel, limiteLitros, 0, true);
    }

    public Barco criarBarco() {
        System.out.println("=== Cadastro de Barco ===");
        String marca = getString("Marca:");
        String modelo = getString("Modelo:");
        int ano = (int) getNumero("Ano de fabricação:");
        double combustivel = (double) getNumero("Quantidade de combustível:");
        double limiteLitros = (double) getNumero("Limite do tanque de combustível:");
        String tipoCasco = getString("Tipo de casco:");

        return new Barco(marca, modelo, ano, false, 0.0, combustivel, limiteLitros, tipoCasco);
    }

    public Trem criarTrem() {
        System.out.println("=== Cadastro de Trem ===");
        String marca = getString("Marca:");
        String modelo = getString("Modelo");
        int ano = (int) getNumero("Ano de fabricação:");
        double combustivel = (double) getNumero("Quantidade de combustível:");
        double limiteLitros = (double) getNumero("Limite do tanque de combustível:");
        int numeroVagoes = (int) getNumero("Número de vagões:");

        return new Trem(marca, modelo, ano, false, 0.0, combustivel, limiteLitros, numeroVagoes);
    }

    public HashMap<String, Veiculo> getVeiculos() {
        return veiculos;
    }

    private static String getString(String mensagem) {
        while (true) {
            try{
                System.out.println(mensagem);
                String input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    throw new IllegalArgumentException("O campo não pode ser vazio!");
                }
                return input;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static Number getNumero(String mensagem) {
        while (true) {
            try {
                System.out.println(mensagem);
                String input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    throw new IllegalArgumentException("O campo não pode ser vazio!");
                } 
                double numero = Double.parseDouble(input);

                if (numero == (int) numero) {
                    return (int) numero;
                } else {
                    return numero;
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
                String input = scanner.nextLine().trim();

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
