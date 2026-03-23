import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sessao {
    private int id;
    private LocalDateTime horario;
    private int sala;
    private Filme filme; // Agregação
    private ArrayList<Ingresso> ingressos; // Composição

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.ingressos = new ArrayList<>();
    }

    // Agregação: Vincula um filme que já existe
    public void vincularFilme(Filme f) {
        this.filme = f;
    }

    // Composição: O ingresso nasce na venda
    public void venderIngresso(int id, String assento, String tipo, float preco) {
        Ingresso novo = new Ingresso(id, assento, tipo, preco);
        this.ingressos.add(novo);
    }

    @Override
    public String toString() {
        return "\n--- SESSÃO DE CINEMA ---" +
                "\nFilme: " + (filme != null ? filme.getTitulo() : "Nenhum filme vinculado") +
                "\nHorário: " + horario + " | Sala: " + sala +
                "\nIngressos Vendidos: " + ingressos;
    }
}