public static void main(String[] args) {
    Placar jogo = new Placar("Franca", "São Paulo");

    // Franca faz uma cesta de 3
    jogo.registrarPonto("casa", 3);

    // São Paulo faz um lance livre (1 ponto)
    jogo.registrarPonto("visitante", 1);

    System.out.println(jogo.toString());

    // Muda o quarto
    jogo.proximoQuarto();
}