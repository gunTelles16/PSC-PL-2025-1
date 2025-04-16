import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Aluno aluno = null;
        Professor professor = null;
        Coordenador coordenador = null;

        while (aluno == null) {
            try {
                System.out.println("\n=== Cadastro de Aluno ===");
                System.out.println("\nNome:");
                String nome = scanner.nextLine();

                System.out.println("\nIdade:");
                int idade = Integer.parseInt(scanner.nextLine());

                System.out.println("\nAltura:");
                double altura = Double.parseDouble(scanner.nextLine());

                System.out.println("\nEmail:");
                String email = scanner.nextLine();

                System.out.println("\nRA:");
                int ra = Integer.parseInt(scanner.nextLine());

                aluno = new Aluno(nome, idade, altura, email, ra, 0.0);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while (professor == null) {
            System.out.println("\n=== Cadastro de Professor ===");
            System.out.println("\nNome:");
            String nome = scanner.nextLine();

            System.out.println("\nIdade:");
            int idade = Integer.parseInt(scanner.nextLine());

            System.out.println("\nAltura:");
            double altura = Double.parseDouble(scanner.nextLine());

            System.out.println("\nEmail:");
            String email = scanner.nextLine();

            System.out.println("\nMatrícula:");
            int matricula = Integer.parseInt(scanner.nextLine());

            professor = new Professor(nome, idade, altura, email, matricula);

            aluno.setNota(7.5);// Professor atribui nota ao aluno
        }

        while (coordenador == null) {
            System.out.println("\n=== Cadastro de Coordenador ===");
            System.out.println("\nNome:");
            String nome = scanner.nextLine();

            System.out.println("\nIdade:");
            int idade = Integer.parseInt(scanner.nextLine());

            System.out.println("\nAltura:");
            double altura = Double.parseDouble(scanner.nextLine());

            System.out.println("\nEmail:");
            String email = scanner.nextLine();

            System.out.println("\nMatrícula:");
            int matricula = Integer.parseInt(scanner.nextLine());

            coordenador = new Coordenador(nome, idade, altura, email, matricula);
        }

        coordenador.exibirDados(); // Exibindo os dados do coordenador
        professor.exibirDados(); // Exibindo os dados do professor
        aluno.exibirDados(); // Exibindo os dados do aluno
    }
}