class Junior extends Desenvolvedor {
    public Junior(String nome, double salario) { super(nome, salario); }

    @Override
    public void codar() { System.out.println("Junior: Aprendendo e codando com calma..."); }

    @Override
    public double calcularBonus() { return getSalarioBase() * 0.10; } // 10%
}