import java.util.ArrayList;

public class TestaDesenvolvedor {

    public static void exibir(Desenvolvedor camaleao){
        camaleao.codar();
        System.out.println(camaleao.toString() + "Bonus " + camaleao.calcularBonus());
        //subclasse camaleao -- pra quem ele aponta, subclasse
    }
    public static void main(String[] args){
        Junior j1 = new Junior("Fulano","Java", 2348, "Ciclano");
        exibir(j1);

        Pleno pl1 = new Pleno("Jose", "C++", 9283,5);
        exibir(pl1);

        Senior sn1 = new Senior("Maria", "Python", 6000,10000);
        exibir(sn1);

        ArrayList<Desenvolvedor> empresa = new ArrayList<Desenvolvedor>();
        empresa.add(j1);
        empresa.add(pl1);
        empresa.add(sn1);

    }
}
