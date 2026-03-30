class Senior extends Desenvolvedor {
    public Senior(String nome, double salario) { super(nome, salario); }

    @Override
    public void codar() { System.out.println("Senior: Arquitetando soluções e codando o impossível..."); }

    @Override
    public double calcularBonus() { return getSalarioBase() * 0.25; } // 25%
}