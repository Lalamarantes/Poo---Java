public class TestaCarro {
    /*public static void main(String[] args) {
        //instanciar objeto obj1
        Carro obj1 = new Carro();
        obj1.marca = "Fiat";
        obj1.modelo = "Uno";
        obj1.velocidade = 0;
        obj1.motor = false;
        System.out.println(obj1.toString());

        Carro obj2 = new Carro();
        obj2.marca = "GM";
        obj2.modelo = "Onix";
        obj2.velocidade = 0;
        obj2.motor = false;
        System.out.println(obj2.toString());
    }*/

    //cria e preenche tudo em uma unica linha com o metodo construtivo
    public static void main (String[] args) {
        Carro obj1 = new Carro("McLaren", "MCL39", 300, false);
        System.out.println(obj1.toString());
        obj1.ligar();
        obj1.desligar();
        Carro obj2 = new Carro ("Aston Martin", "DB12", 290, false);
        System.out.println(obj2.toString());
        obj2.ligar();
        obj2.desligar();
        Carro obj3 = new Carro("Mercedes", "GT63S", 200, false);
        System.out.println(obj3.toString());
        obj3.ligar();
        obj3.acelerar(60);
        obj3.frear(40);
    }



}
