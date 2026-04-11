public class TestaSmartHome {
    public static void main(String[] args) {
        System.out.println("--- Testando Fechadura ---");
        FechaduraEletronica minhaPorta = new FechaduraEletronica();
        minhaPorta.validarAcesso("9999"); // Errada
        minhaPorta.ligar(); // Deve falhar

        minhaPorta.validarAcesso("1234"); // Certa
        minhaPorta.ligar(); // Deve destrancar

        System.out.println("\n--- Testando Termostato ---");
        TermostatoSmart meuAr = new TermostatoSmart();
        meuAr.ligar();
        System.out.println("Temperatura atual: " + meuAr.lerTemperatura() + "°C");
    }
}