public abstract class Carro extends Veiculo {
    protected int numeroPortas;
    protected boolean arCondicionado;

    public Carro(String marca, String modelo, int ano, boolean motorLigado, double velocidadeAtual, double combustivel,
        int numeroPortas, boolean arCondicionado) {
            super(marca, modelo, ano, false, 0.0, combustivel);
            setNumeroPortas(numeroPortas);
            setArcondicionado(arCondicionado);
    }

    public void exibirInfo() {
        System.out.println("=== Informações do Véiculo ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de fabricação: " + getAno());
        System.out.print("Motor Ligado : " + (isMotorLigado() ? "Sim" : "Não"));
        System.out.println("Velocidade atual: " + getVelocidadeAtual() + " km/h");
        System.out.println("Combustível: " + getCombustivel() + " litros");
        System.out.println("Número de portas: " + getNumeroPortas());
        System.out.println("Ar condicionado: " + (isArcondicionado() ? "Sim" : "Não"));
    }

    public int getNumeroPortas() {
        return this.numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        if (numeroPortas < 2 || numeroPortas > 5) {
            throw new IllegalArgumentException("O número de portas deve ser entre 2 e 5!");
        }
        this.numeroPortas = numeroPortas;
    }

    public boolean isArcondicionado() {
        return this.arCondicionado;
    }

    public void setArcondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }
}
