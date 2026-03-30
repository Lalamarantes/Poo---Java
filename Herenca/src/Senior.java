public class Senior extends Desenvolvedor{
    private float verbaLider;

    public Senior(){
        super(); //chama construtor da superclasse
    }

    public Senior(String nome, String linguagem, float salarioBase, float verbaLider){
        super(nome, linguagem, salarioBase);
        this.verbaLider = verbaLider;
    }

    public float getVerbaLider() {
        return verbaLider;
    }

    public void setVerbaLider(float verbaLider) {
        this.verbaLider = verbaLider;
    }

    @Override
    public String toString() {
        return "Senior{" +
                super.toString() +
                "verbaLider=" + verbaLider +
                '}';
    }

    @Override
    public void codar(){
        System.out.println("Senior definindo a arquitetura do software e liderando pessoas");
    }

    @Override
    public float calcularBonus() {
        return super.calcularBonus() + this.salarioBase + 0.3f;
    }
}
