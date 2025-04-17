public class SUV extends Carro {
    private boolean tracao4x4;
    private boolean tetoSolar;

    public SUV(String marca, String modelo, int ano, boolean motorLigado, double velocidadeAtual, double combustivel,
        int numeroPortas, boolean arCondicionado, boolean tracao4x4, boolean tetoSolar) {
            super(marca, modelo, ano, false, 0.0, combustivel, numeroPortas, arCondicionado);
            setTracao4x4(tracao4x4);
            setTetoSolar(tetoSolar);
    }

    @Override
    public void exibirInfo() {
        System.out.println("=== Informações do SUV ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de fabricação: " + getAno());
        System.out.print("Motor Ligado: " + (isMotorLigado() ? "Sim" : "Não"));
        System.out.println("Velocidade atual: " + getVelocidadeAtual() + " km/h");
        System.out.println("Combustível: " + statusCombustivel() + " litros");
        System.out.println("Número de portas: " + getNumeroPortas());
        System.out.println("Ar condicionado: " + (isArcondicionado() ? "Sim" : "Não"));
        System.out.println("Tração 4x4: " + (isTracao4x4() ? "Sim" : "Não"));
        System.out.println("Teto solar: " + (isTetoSolar() ? "Sim" : "Não"));
    }

    public boolean isTracao4x4() {
        return this.tracao4x4;
    }

    public void setTracao4x4(boolean tracao4x4) {
        this.tracao4x4 = tracao4x4;
    }

    public boolean isTetoSolar() {
        return this.tetoSolar;
    }

    public void setTetoSolar(boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }
}
