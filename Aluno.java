public class Aluno extends Pessoa{
    private int ra;
    private double nota;

    public Aluno(String nome, int idade, double altura, String email, int ra, double nota) {
        super(nome, idade, altura, email);
        setRA(ra);
        this.nota = 0;
    }

    public void exibirDados() {
        System.out.println("\n=== Dados do Aluno ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Email: " + getEmail());
        System.out.println("RA: " + getRA());
        System.out.println("Nota: " + getNota());
    }

    public int getRA() {
        return this.ra;
    }

    public void setRA(int ra) {
        if (ra < 0) {
            throw new IllegalArgumentException("RA não pode ser negativo!");
        }
        this.ra = ra;
    }

    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10!");
        }
        this.nota = nota;
    }
}