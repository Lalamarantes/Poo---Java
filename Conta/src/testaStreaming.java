public static void main(String[] args){
    Streaming user1 = new Streaming("Lando Norris", "Premium");
    user1.assistirFilme(Bridgerton);
    user1.cancelarAssinatura();
    System.out.println(user1.toString());
}