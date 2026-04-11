public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura {
    private boolean ligado = false;

    @Override
    public void ligar() {
        this.ligado = true;
        System.out.println("Termostato: Sistema de climatização LIGADO.");
    }

    @Override
    public void desligar() {
        this.ligado = false;
        System.out.println("Termostato: Sistema de climatização DESLIGADO.");
    }

    @Override
    public double lerTemperatura() {
        if (ligado) {
            return 22.5; // Simulação de leitura de sensor
        } else {
            System.out.println("Aviso: Termostato desligado. Leitura imprecisa.");
            return 0.0;
        }
    }
}
