import java.util.ArrayList;

public class Edificio {
    private String nome;
    private String endereco;
    private ArrayList<Apartamento> apartamentos;

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    public Edificio() {
    }

    // MÉTODO DE COMPOSIÇÃO: Recebe tipos primitivos e cria o objeto
    public void construirApartamento(int num, int andar) {
        Apartamento novoAp = new Apartamento(num, andar);
        this.apartamentos.add(novoAp);
    }

    @Override
    public String toString() {
        return "Edifício: " + nome + "\nEndereço: " + endereco + "\nLista de Aps: " + apartamentos;
    }
}