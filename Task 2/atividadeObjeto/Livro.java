import java.util.Scanner;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numeroPaginas;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numeroPaginas = numeroPaginas;
        this.disponivel = true;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }

    public void marcarComoEmprestado() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro marcado como emprestado.");
        } else {
            System.out.println("Livro já está emprestado.");
        }
    }

    public void marcarComoDevolvido() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Livro marcado como devolvido.");
        } else {
            System.out.println("Livro já está disponível.");
        }
    }

    public int calcularTempoDesdePublicacao() {
        int anoAtual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        return anoAtual - anoPublicacao;
    }

    public boolean estaDisponivel() {
        return disponivel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();

        System.out.print("Digite o ano de publicação: ");
        int anoPublicacao = scanner.nextInt();

        System.out.print("Digite o número de páginas: ");
        int numeroPaginas = scanner.nextInt();

        Livro livro1 = new Livro(titulo, autor, anoPublicacao, numeroPaginas);

        livro1.exibirDetalhes();

        System.out.println("Deseja alterar o título do livro? (sim/não)");
        scanner.nextLine(); // Limpar buffer do scanner
        if(scanner.nextLine().equalsIgnoreCase("sim")) {
            System.out.print("Digite o novo título: ");
            livro1.setTitulo(scanner.nextLine());
        }

        System.out.println("Deseja marcar o livro como emprestado? (sim/não)");
        if(scanner.nextLine().equalsIgnoreCase("sim")) {
            livro1.marcarComoEmprestado();
        }

        System.out.println("Deseja marcar o livro como devolvido? (sim/não)");
        if(scanner.nextLine().equalsIgnoreCase("sim")) {
            livro1.marcarComoDevolvido();
        }

        System.out.println("Tempo desde a publicação: " + livro1.calcularTempoDesdePublicacao() + " anos.");

        System.out.println("O livro está disponível? " + (livro1.estaDisponivel() ? "Sim" : "Não"));

        scanner.close();
    }
}
