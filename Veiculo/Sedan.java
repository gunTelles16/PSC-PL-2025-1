public class Sedan extends Carro {
    private boolean bancoDeCouro;
    private boolean pilotoAutomatico;
    
    public Sedan(String marca, String modelo, int ano, boolean motorLigado, double velocidadeAtual, double combustivel,
        int numeroPortas, boolean arCondicionado, boolean bancoDeCouro, boolean pilotoAutomatico) {
            super(marca, modelo, ano, false, 0.0, combustivel, numeroPortas, arCondicionado);
            setBancoDeCouro(bancoDeCouro);
            setPilotoAutomatico(pilotoAutomatico);
    }

    @Override // 
    public void exibirInfo() {
        System.out.println("=== Informações do Sedan ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de fabricação: " + getAno());
        System.out.println("Motor ligado: " + (isMotorLigado() ? "Sim" : "Não"));
        System.out.println("Velocidade atual: " + getVelocidadeAtual() + " km/h");
        System.out.println("Combustível: " + getCombustivel() + " litros");
        System.out.println("Número de portas: " + getNumeroPortas());
        System.out.println("Ar condicionado: " + (isArcondicionado() ? "Sim" : "Não"));
        System.out.println("Banco de couro: " + (isBancoDeCouro() ? "Sim" : "Não"));
        System.out.println("Piloto automático: " + (isPilotoAutomatico() ? "Sim" : "Não"));
    }

    public boolean isBancoDeCouro() {
        return this.bancoDeCouro;
    }

    public void setBancoDeCouro(boolean bancoDeCouro) {
        this.bancoDeCouro = bancoDeCouro;
    }

    public boolean isPilotoAutomatico() {
        return this.pilotoAutomatico;
    }

    public void setPilotoAutomatico(boolean pilotoAutomatico) {
        this.pilotoAutomatico = pilotoAutomatico;
    }
}
