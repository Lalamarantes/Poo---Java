public class TestaTransporte {
    public static void main(String[] args) {
        // 1. Criando instâncias normais
        Aviao jato = new Aviao("Embraer", "Phenom 300", 830, 13000);
        CarroEletrico tesla = new CarroEletrico("Tesla", "Model 3", 200, 500);

        // 2. O CORAÇÃO DO POLIMORFISMO
        System.out.println("--- Teste de Polimorfismo ---");

        // Variável do tipo Pai apontando para um Filho (Avião)
        Veiculo v = jato;
        v.mover(); // Vai executar o mover() do AVIÃO

        // A mesma variável agora aponta para outro Filho (Carro Elétrico)
        v = tesla;
        v.mover(); // Vai executar o mover() do CARRO ELÉTRICO

        System.out.println("\n--- Teste de Abastecimento ---");
        jato.abastecer();
        tesla.abastecer();
    }
}