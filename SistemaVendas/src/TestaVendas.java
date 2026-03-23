public class TestaVendas {
    public static void main(String[] args) {
        // 1. Criamos o "Estoque" (Produtos independentes)
        Produto p1 = new Produto(101, "Monitor Gamer", 1200.00);
        Produto p2 = new Produto(102, "Mouse Sem Fio", 150.00);

        // 2. Criamos o Cliente (Independente)
        Cliente c1 = new Cliente(1, "Laura");

        // 3. Iniciamos a Venda (O Todo)
        Venda minhaVenda = new Venda(c1);

        // 4. Composição em ação: Criamos os itens de venda passando o produto
        minhaVenda.adicionarItem(1, 1, p1); // 1 Monitor
        minhaVenda.adicionarItem(2, 2, p2); // 2 Mouses

        // 5. Resultado final
        System.out.println(minhaVenda.toString());

        // PROVA: Se eu fizer 'minhaVenda = null', a lista de itens e os cálculos somem,
        // mas a Laura (c1) e os Produtos (p1, p2) continuam existindo no sistema!
    }
}