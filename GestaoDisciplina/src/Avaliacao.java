import java.util.ArrayList;

public class Avaliacao {
    private int id;
    private String nome;
    private ArrayList<Questao> questoes;

    public Avaliacao(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.questoes = new ArrayList<>(); // A lista nasce com a avaliação
    }

    // objeto Questao é criado AQUI DENTRO
    public void adicionarQuestao(int num, String texto, float peso) {
        Questao nova = new Questao(num, texto, peso);
        this.questoes.add(nova);
    }

    @Override
    public String toString() {
        return "Avaliação: " + nome + " | Questões: " + questoes;
    }
}
