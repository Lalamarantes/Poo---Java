class Pleno extends Desenvolvedor {
    public Pleno(String nome, double salario) { super(nome, salario); }

    @Override
    public void codar() { System.out.println("Pleno: Codando features e revisando PRs..."); }

    @Override
    public double calcularBonus() { return getSalarioBase() * 0.15; } // 15%
}