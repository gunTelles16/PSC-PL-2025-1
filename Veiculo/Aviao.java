public class Aviao extends Veiculo {
    private double altitude;
    private boolean tremDePousoBaixado;
    
    public Aviao(String marca, String modelo, int ano, boolean motorLigado, double velocidadeAtual, double combustivel,
            double limiteLitros,double altitude, boolean tremDePousoBaixado ) {
        super(marca, modelo, ano, false, 0.0, combustivel, limiteLitros);
        this.altitude = 0;
        this.tremDePousoBaixado = true;
    }

    @Override
    public void exibirInfo() {
        System.out.println("=== Informações do Avião ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de fabricação: " + getAno());
        System.out.println("Motor ligado: " + (isMotorLigado() ? "Sim" : "Não"));
        System.out.println("Velocidade atual: " + getVelocidadeAtual() + " km/h");
        System.out.println("Combustível: " + getCombustivel() + " litros");
        System.out.println("Limite do tanque de combustível: " + getLimiteLitros() + " litros");
        System.out.println("Altitude: " + getAltitude() + " m");
        System.out.println("Trem de pouso: " + (isTremDePousoBaixado() ? "Levantado" : "Baixado"));
    }

    public double getAltitude() {
        return this.altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public boolean isTremDePousoBaixado() {
        return this.tremDePousoBaixado;
    }

    public void setTremDePousoBaixado(boolean tremDePousoBaixado) {
        this.tremDePousoBaixado = tremDePousoBaixado;
    }

    @Override // Sobrescrevendo o método acelerar para modificar a aceleração
    public void acelerar() {
        super.acelerar();
        super.setVelocidadeAtual(200);
    }

    public void decolar() {
        if (this.altitude <= 0 && super.isMotorLigado()) {
            this.acelerar();

            if (this.velocidadeAtual < 200) {
                throw new IllegalArgumentException("Acelere o avião até 200 km/h para decolar!");
            }

            this.altitude += 1000;
            this.tremDePousoBaixado = false;

            System.out.println("Avião decolou!");
        } else {
            System.out.println("Avião já decolou!");
        }
    }

    public void aterrisar() {
        while (this.altitude > 0) {
            if (this.altitude >= 1000) {
                throw new IllegalArgumentException("Não é possível aterrisar! Diminua sua altitude para menos de 1000 m.");
            }
            this.altitude = 1000;
        }
    }

    public void subir() {
        while (this.altitude > 0) {
            this.altitude += 1000;
        }

        if (this.altitude <= 0) {
            throw new IllegalArgumentException("Avião na pista!");
        }
    }

    public void descer() {
        while (this.altitude > 0) {
            this.altitude -= 1000;
        }

        if (this.altitude <= 0) {
            throw new IllegalArgumentException("Avião na pista!");
        }
    }
}
