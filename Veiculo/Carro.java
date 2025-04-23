abstract public class Carro extends Veiculo {
    protected int numeroPortas;
    protected boolean arCondicionado;
    protected double limiteLitros;

    public Carro(String marca, String modelo, int ano, boolean motorLigado, double velocidadeAtual, double combustivel,
            double limiteLitros, int numeroPortas, boolean arCondicionado) {
        super(marca, modelo, ano, false, 0.0, combustivel, limiteLitros);
        setNumeroPortas(numeroPortas);
        setArcondicionado(arCondicionado);
        setLimiteLitros(combustivel);
    }

    abstract protected void exibirInfo();

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
