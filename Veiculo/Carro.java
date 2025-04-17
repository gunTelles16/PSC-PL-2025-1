abstract public class Carro extends Veiculo {
    protected int numeroPortas;
    protected boolean arCondicionado;
    protected double limiteLitros;

    public Carro(String marca, String modelo, int ano, boolean motorLigado, double velocidadeAtual, double combustivel,
        int numeroPortas, boolean arCondicionado) {
            super(marca, modelo, ano, false, 0.0, combustivel);
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

    public double getLimiteLitros() {
        return limiteLitros;
    }

    public void setLimiteLitros(double limiteLitros) {
        this.limiteLitros = limiteLitros;
    }

    @Override
    public void abastecer(double combustivel) {
        if (this.limiteLitros - super.statusCombustivel() >= combustivel) {
            super.abastecer(combustivel);
        }
    }
}
