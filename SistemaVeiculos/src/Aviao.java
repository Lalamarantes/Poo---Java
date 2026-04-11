public class Aviao extends Veiculo {
    private float altitudeMax;

    public Aviao(String marca, String modelo, float velocidade, float altitudeMax) {
        super(marca, modelo, velocidade); // Passa os dados para o construtor do Pai
        this.altitudeMax = altitudeMax;
    }

    @Override
    public void mover() {
        System.out.println("Avião voando a " + getVelocidade() + " km/h e " + altitudeMax + " metros.");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo com querosene de aviação.");
    }
}