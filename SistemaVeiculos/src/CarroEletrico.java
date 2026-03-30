public class CarroEletrico extends Veiculo {
    private int autonomiaBateria;

    public CarroEletrico(String marca, String modelo, float velocidade, int autonomia) {
        super(marca, modelo, velocidade);
        this.autonomiaBateria = autonomia;
    }

    @Override
    public void mover() {
        System.out.println("Carro elétrico movendo-se silenciosamente.");
    }

    @Override
    public void abastecer() {
        System.out.println("Recarregando bateria em posto de carga rápida.");
    }
}