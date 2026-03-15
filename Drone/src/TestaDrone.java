public class TestaDrone {
    public static void main(String[] args) {
        Drone d1 = new Drone("VANT-01", 15);
        d1.decolar();
        System.out.println(d1.toString());

        Drone d2 = new Drone("VANT-02", 100);

        d2.subir(10);
        d2.decolar();

        if (d2.toString().contains("Em Voo")) {
            // Se decolou, vamos testar o limite de altura
            d2.subir(50);  // Altura deve ir para 52m (2m da decolagem + 50m)
            d2.subir(60);  // Altura deve ir para 112m
            d2.subir(20);  // DEVE DAR ERRO: 112 + 20 = 132m (Passa de 120m)

            System.out.println(d2.toString()); // Verifique se ele travou em 112m ou se aceitou o erro

            d2.descer(112);
            System.out.println(d2.toString());
        }
    }
}