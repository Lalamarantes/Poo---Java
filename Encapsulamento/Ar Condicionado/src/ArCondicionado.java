public class ArCondicionado {
    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado(){

    }

    public ArCondicionado (String marca, String modelo, int temperatura, boolean ligado){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setTemperatura(temperatura);
        this.ligado = true;
    }

    public void setTemperatura(int x){
        if(x >= 16 && x <= 30){
            this.temperatura = x;
        }else{
            System.out.println("Temperatura fora da faixa");
        }
    }

    public void setMarca(String m){
        if(m.length() >= 3){
            this.marca = m;
        }else{
            System.out.println("Marca inválida");
        }
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setLigado (boolean a){
        this.ligado = a;
    }

    private boolean verificarCompressor(){
        double chance = Math.random() * 10;
        return chance > 2;
    }

    public void ativarModoTurbo(){
        System.out.println("Ativando modo turbo...");
        if(verificarCompressor()){
            System.out.println("Compressor Ok");
            setTemperatura(16);
        }else{
            System.out.println("Compressor sem resposta");
        }
    }

    public String toString(){
        return "\n--- STATUS AR CONDICIONADO ---" +
                "\nMarca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nTemperatura: " + this.temperatura + "°C" +
                "\nStatus: " + (this.ligado ? "Ligado" : "Desligado");
    }
}