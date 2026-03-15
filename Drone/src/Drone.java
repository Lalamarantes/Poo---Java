public class Drone {
    private String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    public Drone(String codigo, int bateria) {
        this.codigo = codigo;
        setBateria(bateria);
        this.altura = 0;
        this.emVoo = false;
    }

    public void setAltura(float a){
        if(a >= 0 && a <= 120){
            this.altura = a;
        }else{
            System.out.println("Altura fora do regulamento");
        }
    }

    public void setBateria(int b) {
        if (b >= 0 && b <= 100) {
            this.bateria = b;
        } else {
            System.out.println("Erro: Carga de bateria inválida.");
        }
    }

    private boolean testarMotores() {
        System.out.println("Testando hélices...");
        System.out.println("Calibrando GPS...");

        // Gera um número entre 0 e 10
        double random = Math.random() * 10;
        return random < 8;
    }

    public void decolar() {
        if (this.bateria <= 20) {
            System.out.println("Abortar: Bateria insuficiente para decolar (" + this.bateria + "%).");
        } else {
            if (testarMotores()) {
                this.emVoo = true;
                setAltura(2); // Decola e para a 2 metros de altura
                System.out.println("Drone " + this.codigo + " em voo!");
            } else {
                System.out.println("Falha nos motores. Decolagem cancelada.");
            }
        }
    }

    public void subir(float x) {
        if (this.emVoo) {
            setAltura(this.altura + x);
        } else {
            System.out.println("O drone precisa decolar primeiro!");
        }
    }

    public void descer(float x) {
        if (this.emVoo) {
            setAltura(this.altura - x);
        } else {
            System.out.println("O drone já está no chão!");
        }
    }

    public String toString() {
        return "Drone: " + codigo + " | Bateria: " + bateria + "% | Altura: " + altura + "m | Status: " + (emVoo ? "Em Voo" : "No Chão");
    }
}