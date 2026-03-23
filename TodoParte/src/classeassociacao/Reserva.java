package classeassociacao;

import java.time.LocalDateTime;

public class Reserva {
    private int codigo;
    private LocalDateTime data;
    private int poltrona;
    private Passageiro passageiro;
    private Voo voo;

    public Reserva() {
    }

    public Reserva(int codigo, LocalDateTime data, int poltrona, Passageiro passageiro, Voo voo) {
        this.codigo = codigo;
        this.data = data;
        this.poltrona = poltrona;
        this.passageiro = passageiro;
        this.voo = voo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "codigo=" + codigo +
                ", data=" + data.format() +
                ", poltrona=" + poltrona +
                ", passageiro=" + passageiro +
                ", voo=" + voo +
                '}';
    }
}
