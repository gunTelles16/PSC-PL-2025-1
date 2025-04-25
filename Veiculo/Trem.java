public class Trem extends Veiculo {
    private int numeroVagoes;

    public Trem(String marca, String modelo, int ano, boolean motorLigado, double velocidadeAtual, double combustivel, double limiteLitros, int numeroVagoes) {
        super(marca, modelo, ano, false, 0, combustivel, limiteLitros);
        setNumeroVagoes(numeroVagoes);
    }

    public void exibirInfo() {
        System.out.println("=== Informações do Trem ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de fabricação: " + getAno());
        System.out.println("Motor ligado: " + (isMotorLigado() ? "Sim" : "Não"));
        System.out.println("Velocidade atual: " + getCombustivel() + " km/h");
        System.out.println("Combustível: " + getCombustivel() + " litros");
        System.out.println("Limite do tanque de combustível: " + getLimiteLitros() + " litros");
        System.out.println("Número de vagões: " + getNumeroVagoes());
    }

    public int getNumeroVagoes() {
        return this.numeroVagoes;
    }

    public void setNumeroVagoes(int numeroVagoes) {
        if (this.numeroVagoes < 0) {
            throw new IllegalArgumentException("O número de vagões não pode ser negativo!");
        }
        this.numeroVagoes = numeroVagoes;
    }

    public void acoplarVagoes() {

    }

    public void desacoplarVagao() {

    }
}
