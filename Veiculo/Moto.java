public class Moto extends Veiculo{
    private boolean temCarenagem;
    private boolean partidaEletrica;

    public Moto(String marca, String modelo, int ano, boolean motorLigado, double velocidadeAtual,
        double combustivel, boolean temCarenagem, boolean partidaEletrica) {
            super(marca, modelo, ano, false, 0.0, combustivel);
            setTemCarenagem(temCarenagem);
            setPartidaEletrica(partidaEletrica);
    }

    @Override
    public void exibirInfo() {
        System.out.println("=== Informações da Moto ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de fabricação: " + getAno());
        System.out.println("Motor ligado: " + (isMotorLigado() ? "Sim" : "Não"));
        System.out.println("Velocidade atual: " + getVelocidadeAtual() + " km/h");
        System.out.println("Combustível: " + getCombustivel() + " litros");
        System.out.println("Carenagem: " + (isTemCarenagem() ? "Sim" : "Não"));
        System.out.println("Partida elétrica: " + (isPartidaEletrica() ? "Sim" : "Não"));
    }

    public boolean isTemCarenagem() {
        return this.temCarenagem;
    }

    public void setTemCarenagem(boolean temCarenagem) {
        this.temCarenagem = temCarenagem;
    }

    public boolean isPartidaEletrica() {
        return this.partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }
}
