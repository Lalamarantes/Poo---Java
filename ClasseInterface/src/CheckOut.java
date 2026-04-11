public class CheckOut {
    public static void main(String[] args){
        Pagamento camaleao;

        camaleao = new CartaoCredito();
        camaleao.autorizar(700);
        camaleao.exibirComprovante();

        camaleao = new Pix();
        camaleao.autorizar(300);
        camaleao.exibirComprovante();
    }
}
