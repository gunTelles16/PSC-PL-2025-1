abstract public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected boolean motorLigado;
    protected double velocidadeAtual;
    protected double combustivel;
    protected double limiteLitros;

    public Veiculo(String marca, String modelo, int ano, boolean motorLigado, double velocidadeAtual, double combustivel, 
            double limiteLitros) {
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        this.motorLigado = false; // Motor desligado por padrão
        this.velocidadeAtual = 0.0; // Velocidade inicial 0
        setCombustivel(combustivel);
        setLimiteLitros(limiteLitros);
    }

    abstract protected void exibirInfo();

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("Marca não pode ser vazio!");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("Modelo não pode ser vazio!");
        }
        this.modelo = modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        int anoAtual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);

        if (ano < 1980 || ano > anoAtual) {
            throw new IllegalArgumentException("O ano de fabricação deve ser entre 1980 e " + anoAtual + "!");
        }
        this.ano = ano;
    }

    public boolean isMotorLigado() {
        return this.motorLigado;
    }

    public void setMotorLigado(boolean motorLigado) {
        this.motorLigado = motorLigado;
    }

    public double getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        if (velocidadeAtual < 0) {
            throw new IllegalArgumentException("Velocidade atual não pode ser negativa!");
        }
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getCombustivel() {
        return this.combustivel;
    }

    public void setCombustivel(double combustivel) {
        if (combustivel < 0) {
            throw new IllegalArgumentException("Quantidade de combustível não pode ser negativa!");
        }
        this.combustivel = combustivel;
    }

    public double getLimiteLitros() {
        return this.limiteLitros;
    }

    public void setLimiteLitros(double limiteLitros) {
        if (limiteLitros < 0) {
            throw new IllegalArgumentException("Limite de litros não pode ser negativo!");
        }
        this.limiteLitros = limiteLitros;
    }

    // Métoddos para definir o funcionamento do veículo
    public void ligarMotor() {
        if (this.combustivel <= 0) {
            throw new IllegalStateException("Não é possível ligar o motor sem combustível!");
        }
        this.motorLigado = true;
        System.out.println("Motor ligado!");
    }

    public void desligarMotor() {
        if (this.velocidadeAtual > 0) {
            throw new IllegalStateException("Reduza a velocidade a zero antes de desligar o motor!");
        }
        this.motorLigado = false;
        System.out.println("Motor desligado!");
    }

    public void acelerar() {
        if (this.combustivel <= 0) {
            throw new IllegalStateException("Sem combustível! Não é possível acelerar!");
        }

        if (!this.motorLigado) {
            throw new IllegalStateException("O motor deve estar ligado para acelerar!");
        }
        this.velocidadeAtual += 10;
        this.combustivel --;
        System.out.println("Acelerando... Velocidade atual: " + getVelocidadeAtual() + " km/h. Combustível restante: " + getCombustivel() + " litros.");
    }

    public void frear() {
        if (this.velocidadeAtual <= 0) {
            throw new IllegalStateException("O veículo está parado!");
        }
        this.velocidadeAtual -= 10;
        
        if (this.velocidadeAtual < 0) {
            this.velocidadeAtual = 0;
        }
        System.out.println("Freando... Velocidade atual: " + getVelocidadeAtual() + " km/h.");
    }

    public void abastecer(double combustivel) {
        if (this.motorLigado) {
            throw new IllegalStateException("O motor deve estar desligado para abastecer!");
        }

        if (combustivel <= 0) {
            throw new IllegalArgumentException("Quantidade de combustível deve ser positiva!");
        }

        if (this.combustivel + combustivel > this.limiteLitros) {
            throw new IllegalArgumentException("Abastecimento excede o limite do tanque (" + this.limiteLitros + " litros)!");
        }

        this.combustivel += combustivel;
        System.out.println(combustivel + " litros foram abastecendo no veículo!");
    }

    public void sairVeiculo() {
        if (this.motorLigado) {
            throw new IllegalStateException("Desligue o motor antes de sair do veículo!");
        }

        if (this.velocidadeAtual > 0) {
            throw new IllegalStateException("Reduza a velocidade a zero antes de sair do veículo!");
        }

        System.out.println("Saindo do veículo...");
    }
}
