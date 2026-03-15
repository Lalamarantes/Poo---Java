public class Carro {
  //variaveis ou propriedade ou atributos
  public String marca, modelo; // string é tipo de dado do tipo classe
  public float velocidade;//float é um tipo de dado primitivo
  public boolean motor;//boolean é um tipo de dado primitivo

  //metodo que converte objeto em String
  /*public String toString() {
    //this representa o objeto que chama o metodo
    return " Marca: " + this.marca +
            " Modelo: " + this.modelo +
            " Velocidade: " + this.velocidade +
            " Motor: " + this.motor;
  }*/

  //metodo construtivo tem o mesmo nome da classe
  public Carro (String marca,String modelo, float velocidade, boolean motor) {
    this.marca = marca;
    this.modelo = modelo;
    this.velocidade = velocidade;
    this.motor = motor;
  }

  //ligar o carro
  public void ligar() {
    if (!this.motor) {
      this.motor = true;
      System.out.println("Motor ligado");
    }
  }

  //desligar o carro
  public void desligar(){
    if(this.motor){
      this.motor = false;
      this.velocidade = 0;
      System.out.println("Motor desligado");
    }
  }

  //acelerar
  public void acelerar(int x){
    this.velocidade += x;
    System.out.println("O carro esta a " + this.velocidade);
  }

  //desacelerar
  public void frear(int x) {
    if(this.motor && this.velocidade - x >= 0) {
      this.velocidade -= x;
      System.out.println("Nova velocidade " + this.velocidade);
    } else {
      System.out.println("Nao freou");
    }

  }

  public String toString() {
    return "Marca: " + this.marca +
            " Modelo: " + this.modelo +
            " Velocidade: " + this.velocidade +
            " Motor: " + this.motor;
  }
}