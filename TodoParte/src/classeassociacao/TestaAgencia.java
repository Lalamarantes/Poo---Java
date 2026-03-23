package classeassociacao;

import java.time.LocalDateTime;

public class TestaAgencia {
    public static void main(String[] args){
        Passageiro pas1 = new Passageiro("123", "Oscar");
        System.out.println(pas1.toString());

        LocalDateTime data = LocalDateTime.of(2026, 4, 18, 8,15);
        Voo vo1 = new Voo(777,"Monaco","Miami", data);

        Reserva re1 = new Reserva(912, LocalDateTime.now(), 10, pas1,vo1);
        System.out.println(re1.toString());
        System.out.println(re1.getVoo().getDestino());
        System.out.println();
    }
}
