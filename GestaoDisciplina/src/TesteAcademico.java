public class TestaAcademico {
    public static void main(String[] args) {
        //Instanciando alunos
        Aluno a1 = new Aluno("123", "Laura");
        Aluno a2 = new Aluno("456", "Oscar Piastri");

        //Instanciando disciplina
        Disciplina poo = new Disciplina(1, "POO - Java", "Prof. Girafales");

        //AGREGAÇÃO: Vinculando alunos
        poo.matricularAluno(a1);
        poo.matricularAluno(a2);

        //COMPOSIÇÃO: Criando avaliação dentro da disciplina
        poo.criarAvaliacao(101, "Prova Semestral");

        //COMPOSIÇÃO ANINHADA: Adicionando questões na avaliação que acabamos de criar
        //Pega a primeira avaliação (índice 0) e chamamos o método dela
        poo.getAvaliacao(0).adicionarQuestao(1, "O que é Encapsulamento?", 3.0f);
        poo.getAvaliacao(0).adicionarQuestao(2, "Explique Composição.", 3.5f);
        poo.getAvaliacao(0).adicionarQuestao(3, "Diferencie Agregação.", 3.5f);

        //Resultado
        System.out.println(poo.toString());
    }
}