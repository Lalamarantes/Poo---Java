public class TestaBiblioteca {
    public static void main(String[] args) {
        // Criando os objetos independentes
        Leitor leitor1 = new Leitor(1, "Laura");
        Livro livro1 = new Livro(101, "A Quarta Asa", "Rebecca Yarros");

        // Criando a associação (O empréstimo)
        Emprestimo emp = new Emprestimo(leitor1, livro1);

        // Exibindo o resultado que navega entre as classes
        System.out.println(emp.toString());
    }
}