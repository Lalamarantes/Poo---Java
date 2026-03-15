public class Placar {
    public String nomeTimeCasa;
    public String nomeTimeVisitante;
    public int pontosCasa;
    public int pontosVisitante;
    public int periodoQuarto;

    public Placar(String nomeTimeCasa, String nomeTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    public void registrarPonto(String time, int tipo) {
        if (time.equalsIgnoreCase("casa")) {
            this.pontosCasa += tipo;
        } else if (time.equalsIgnoreCase("visitante")) {
            this.pontosVisitante += tipo;
        } else {
            System.out.println("Time inválido!");
        }
    }

    public void proximoQuarto() {
        if (this.periodoQuarto < 4) {
            this.periodoQuarto++;
            System.out.println("Iniciando o " + this.periodoQuarto + "º quarto!");
        } else {
            System.out.println("O jogo já terminou!");
        }
    }

    public String toString() {
        return  "\n" + this.nomeTimeCasa + " [" + this.pontosCasa + "] x [" + this.pontosVisitante + "] " + this.nomeTimeVisitante +
                "\nPeríodo: " + this.periodoQuarto + "º Quarto";
    }
}
