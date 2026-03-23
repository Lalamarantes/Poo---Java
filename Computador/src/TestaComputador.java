public class TestaComputador {
    public static void main(String[] args) {
        // Criando o computador e passando os dados do processador "de carona"
        Computador meuPC = new Computador(1, "Samsung", "Intel", "i7", 4.2);

        // Ao imprimir o PC, ele mostra o processador que ele mesmo criou
        System.out.println(meuPC.toString());

        // PROVA DA COMPOSIÇÃO:
        // Se eu fizer meuPC = null; o processador lá dentro morre junto,
        // pois não existe nenhuma variável no main que aponte para o processador sozinho.
        meuPC = null;
        System.out.println("\nO computador (e seu processador interno) foram removidos da memória.");
    }
}