public class Barco extends Veiculo {
    private String tipoCasco;

    public Barco(String marca, String modelo, int ano, boolean motorLigado, double velocidadeAtual, double combustivel, double limiteLitros, String tipoCasco) {
        super(marca, modelo, ano, false, 0.0, combustivel, limiteLitros);
        setTipoCasco(tipoCasco);
    }

    public void exibirInfo() {
        System.out.println("=== Informações do Barco ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de fabricação: " + getAno());
        System.out.println("Motor ligado: " + (isMotorLigado() ? "Sim" : "Não"));
        System.out.println("Combustível: " + getCombustivel() + " litros");
        System.out.println("Limite do tanque de combustível: " + getLimiteLitros() + " litros");
        System.out.println("Tipo de casco: " + getTipoCasco());
    }

    public String getTipoCasco() {
        return tipoCasco;
    }

    public void setTipoCasco(String tipoCasco) {
        if (this.tipoCasco == null || this.tipoCasco.trim().isEmpty()) {
            throw new IllegalArgumentException("Tipo de casco não pode ser vazio!");
        }
        this.tipoCasco = tipoCasco;
    }

    public void ancorar() {

    }

    public void soltarAncora() {

    }
}
