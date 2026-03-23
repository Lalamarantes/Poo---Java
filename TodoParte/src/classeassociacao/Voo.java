package classeassociacao;
//objeto-parte
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Voo {
    private int numero;
    private String origem, destino;
    private LocalDateTime data;

    public Voo() {
    }

    public Voo(int numero, String origem, String destino, LocalDateTime data) {
        this.numero = numero;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy ' às ' HH'h'min");
        return "Voo{" +
                "numero=" + numero +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", data=" + data.format(formatoBR) +
                '}';
    }
}
