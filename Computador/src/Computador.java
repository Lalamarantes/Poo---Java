public class Computador {
    private int id;
    private String marca;
    private Processador cpu; // Atributo que é um objeto

    // COMPOSIÇÃO: O Processador é instanciado DENTRO do construtor
    public Computador(int id, String marcaComp, String marcaCpu, String modCpu, double freqCpu) {
        this.id = id;
        this.marca = marcaComp;
        // O "new" acontece aqui: o Processador nasce junto com o PC
        this.cpu = new Processador(marcaCpu, modCpu, freqCpu);
    }

    public Computador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Processador getCpu() {
        return cpu;
    }

    public void setCpu(Processador cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "PC ID: " + id + " | Marca: " + marca + " | CPU: " + cpu;
    }
}