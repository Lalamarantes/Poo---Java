public class Programador {
    private int id;
    private String nome;
    private String linguagemPrincipal;

    public Programador(int id, String nome, String linguagemPrincipal) {
        this.id = id;
        this.nome = nome;
        this.linguagemPrincipal = linguagemPrincipal;
    }

    // Getters necessários para a listagem
    public String getNome() { return nome; }
    public String getLinguagemPrincipal() { return linguagemPrincipal; }

    @Override
    public String toString() {
        return nome + " (Especialista em: " + linguagemPrincipal + ")";
    }
}