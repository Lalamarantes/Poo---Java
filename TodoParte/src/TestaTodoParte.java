import java.util.Date;

public class TestaTodoParte {
    public static void main(String[] args){
        //cria um objeto da classe Cliente independente

        Cliente cl1 = new Cliente();
        Cliente cl2 = new Cliente(1,"Fulano","1234","rua chile");

        Produto pr1 = new Produto(100, "mouse", "mouse optico", 180);
        ItemPedido ip1 = new ItemPedido();
        Produto pr2 = new Produto(200, "monitor", "widescreen", 900);
        ItemPedido ip2 = new ItemPedido();
        Produto pr3 = new Produto(201, "cooler", "air cooler", 300);
        ItemPedido ip3 = new ItemPedido();

        //cria o objeto-todo
        Pedido ped1 = new Pedido(10, new Date(),cl2);
        ped1.adicionarItemPedido(1000, 5, pr1);
        ped1.adicionarItemPedido(201, 2, pr2);
        ped1.adicionarItemPedido(303,12,pr3);
        System.out.println(ped1.toString());
    }
}
