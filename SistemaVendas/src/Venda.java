import java.util.ArrayList;

public class Venda {
    private Cliente cliente; // Agregação
    private ArrayList<ItemVenda> itens; // Composição

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    // Método de Composição: cria o ItemVenda aqui dentro
    public void adicionarItem(int id, int qtd, Produto p) {
        ItemVenda novoItem = new ItemVenda(id, qtd, p);
        this.itens.add(novoItem);
    }

    @Override
    public String toString() {
        return "VENDA PARA: " + cliente.getNome() + "\nITENS:" + itens;
    }
}