import java.time.LocalDate;

public class Emprestimo {
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;
    private Leitor leitor; // Associação/Agregação
    private Livro livro;   // Associação/Agregação

    public Emprestimo(Leitor leitor, Livro livro) {
        this.leitor = leitor;
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now(); // Data atual
        this.dataDevolucaoPrevista = this.dataEmprestimo.plusDays(7); // +7 dias
    }

    @Override
    public String toString() {
        return "\n--- COMPROVANTE DE EMPRÉSTIMO ---" +
                "\nLeitor: " + leitor.getNome() +
                "\nLivro: " + livro.getTitulo() +
                "\nRetirada: " + dataEmprestimo +
                "\nDevolução: " + dataDevolucaoPrevista;
    }
}