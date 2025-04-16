public class Professor extends Pessoa {
    private int matricula;

    public Professor(String nome, int idade, double altura, String email, int matricula) {
        super(nome, idade, altura, email);
        setMatricula(matricula);
    }

    public void exibirDados() {
        System.out.println("\n=== Dados do Professor ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Email: " + getEmail());
        System.out.println("Matrícula: " + getMatricula());
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        if (matricula < 0) {
            throw new IllegalArgumentException("Matrícula não pode ser negativa!");
        }
        this.matricula = matricula;
    }
}
