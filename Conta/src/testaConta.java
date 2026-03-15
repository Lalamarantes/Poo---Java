public static void main(String[] args){
    Conta c1 = new Conta(1001,44,"Joao Silva", 0,true);
    c1.depositar(500);
    c1.sacar(200);
    c1.encerrarConta();
    System.out.println(c1.toString());
    c1.sacar(300);
    c1.encerrarConta();
    System.out.println(c1.toString());

    Conta c2 = new Conta(2050,88,"Maria Souza", 0, true);
    c2.sacar(200);
    System.out.println(c2.toString());
}

