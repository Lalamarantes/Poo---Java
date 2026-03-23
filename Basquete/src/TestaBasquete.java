public class TestaBasquete {
    public static void main(String[] args) {
        // Criamos o atleta primeiro (ele existe por si só)
        Atleta ala = new Atleta(23, "Lucas Dias", "Ala-Pivô");

        // Criamos o time e contratamos o atleta
        Time franca = new Time(1, "Sesi Franca", "Helinho Garcia");
        franca.contratarAtleta(ala);

        System.out.println("Antes de anular: " + franca);

        // PROVA: Anulamos o objeto Time
        franca = null;

        // O objeto 'ala' ainda pode ser impresso? SIM!
        System.out.println("\nO time foi anulado, mas o atleta continua aqui:");
        System.out.println(ala);
    }
}