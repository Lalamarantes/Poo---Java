import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> equipe; // Agregação (1:N)

    public Projeto(int id, String nomeProjeto) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.equipe = new ArrayList<>(); // Inicializa a lista vazia
    }

    // Método para agregar programadores já existentes
    public void adicionarProgramador(Programador p) {
        this.equipe.add(p);
    }

    // Regra: Listar todos os programadores do projeto
    public void listarEquipe() {
        System.out.println("\n--- LISTA DE EQUIPE: " + this.nomeProjeto + " ---");
        if (equipe.isEmpty()) {
            System.out.println("Nenhum programador alocado neste projeto.");
        } else {
            for (Programador p : equipe) {
                System.out.println("- " + p.getNome() + " [" + p.getLinguagemPrincipal() + "]");
            }
        }
        System.out.println("------------------------------------------");
    }
}