public class TestaVetorPolimorfico {
    public static void main(String[] args) {
        // 1. Criando o vetor de tamanho 4 do tipo da Superclasse
        Desenvolvedor[] time = new Desenvolvedor[4];

        // 2. Preenchendo com objetos de diferentes tipos (Polimorfismo de inclusão)
        time[0] = new Junior("Laura", 4000);
        time[1] = new Pleno("Lando Norris", 8000);
        time[2] = new Senior("Oscar Piastri", 15000);
        time[3] = new Desenvolvedor("Estagiário Fantasma", 2000);

        // 3. Percorrendo o vetor

        for (Desenvolvedor dev : time) {
            // Chama o método correto dependendo da instância real do objeto
            dev.codar();

            System.out.println("Bônus calculado: R$" + dev.calcularBonus());
            System.out.println(dev.toString());
        }
    }
}