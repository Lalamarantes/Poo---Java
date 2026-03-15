import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome;
    private String professor;
    private ArrayList<Aluno> alunos; // Agregação
    private ArrayList<Avaliacao> avaliacoes; // Composição

    public Disciplina(int id, String nome, String professor) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    // AGREGAÇÃO: O aluno já vem pronto de fora --se eu entendi
    public void matricularAluno(Aluno a) {
        this.alunos.add(a);
    }

    // COMPOSIÇÃO: A avaliação é criada aqui dentro -- acho?
    public void criarAvaliacao(int id, String nome) {
        Avaliacao novaAva = new Avaliacao(id, nome);
        this.avaliacoes.add(novaAva);
    }

    public Avaliacao getAvaliacao(int index) {
        return avaliacoes.get(index);
    }

    @Override
    public String toString() {
        return "DISCIPLINA: " + nome + " (Prof. " + professor + ")" +
                "\nALUNOS MATRICULADOS: " + alunos +
                "\nAVALIAÇÕES: " + avaliacoes;
    }
}