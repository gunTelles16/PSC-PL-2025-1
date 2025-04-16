public class Coordenador extends Pessoa {
    private int matricula;

    public Coordenador(String nome, int idade, double altura, String email, int matricula) {
        super(nome, idade, altura, email);
        setMatricula(matricula);
    }

    public void exibirDados() {
        System.out.println("\n=== Dados do Coordenador ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Email: " + getEmail());
        System.out.println("Matrícula: " + getMatricula());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if (matricula < 0) { 
            throw new IllegalArgumentException("Matrícula não pode ser negativa!");
        }
        this.matricula = matricula;
    }
}
