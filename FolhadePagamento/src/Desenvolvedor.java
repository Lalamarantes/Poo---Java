public class Desenvolvedor {
    private String nome;
    private double salarioBase;

    public Desenvolvedor(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() { return salarioBase; }

    public void codar() {
        System.out.println("Desenvolvedor genérico escrevendo código...");
    }

    public double calcularBonus() {
        return salarioBase * 0.05; // 5% de bônus padrão
    }

    @Override
    public String toString() {
        return "Dev: " + nome + " | Salário: R$" + salarioBase;
    }
}