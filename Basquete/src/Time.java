import java.util.ArrayList;

public class Time {
    private int id;
    private String nome;
    private String tecnico;
    private ArrayList<Atleta> elenco; // Agregação: Lista de referências

    public Time(int id, String nome, String tecnico) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
        this.elenco = new ArrayList<>();
    }

    public void contratarAtleta(Atleta a) {
        this.elenco.add(a);
    }

    @Override
    public String toString() {
        return "Time: " + nome + " | Técnico: " + tecnico + "\nElenco: " + elenco;
    }
}