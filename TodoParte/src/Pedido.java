import javax.imageio.event.IIOReadProgressListener;
import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int id;
    private Date data;
    private Cliente cliente; // associação todo-parte
    private ArrayList<ItemPedido> itensPedido;

    public Pedido() {
        this.itensPedido = new ArrayList<>(); //aloca espaço na memória
    }

    //cliente veio pronto, mostrando sua independencia do pedido
    public Pedido(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.itensPedido = new ArrayList<>();
    }

    //adiciona um item de pedido no vetor ou no pedido.
    public void adicionarItemPedido(int id, float qtde, Produto produto){
        ItemPedido aux = new ItemPedido(id, qtde, produto);
        this.itensPedido.add(aux);
        System.out.println("Item do pedido adicionado com sucesso");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float calculaTotalPedido(){
        return 0;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", data=" + data +
                ", cliente=" + cliente +
                ", itens do pedido = " + itensPedido +
                '}';
    }
}
