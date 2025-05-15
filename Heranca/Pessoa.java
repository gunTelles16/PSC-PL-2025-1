abstract public class Pessoa {
    protected String nome;
    protected int idade;
    protected double altura;
    protected String email;

    public Pessoa(String nome, int idade, double altura, String email) {
        setNome(nome);
        setIdade(idade);
        setAltura(altura);
        setEmail(email);
    }

    abstract protected void exibirDados();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio!");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa!");
        }
        this.idade = idade;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("Altura não pode ser negativa!");
        }
        this.altura = altura;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("O email não pode ser vazio!");
        }
        this.email = email;
    }    
}
