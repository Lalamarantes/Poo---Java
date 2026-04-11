public class CartaoCredito implements Pagamento {
    @Override
    public void autorizar(double valor) {
        System.out.println("Verificando o limite do cartao");
        System.out.println("Pagamento no valor " + valor + " foi autorizado"); //pode criar variaveis
    }

    @Override
    public void exibirComprovante() {
        System.out.println("Comprovante enviado para o email");

    }
}
