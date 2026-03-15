public class SmartTv {
    private String marca, modelo;
    private int volume;
    private boolean conectadaInternet;

    public SmartTv() {

    }

    public SmartTv(String marca, String modelo, int volume){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);//para nao perder o encapsulamento
        this.conectadaInternet = false;
    }

    //setter do volume
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }else{
            System.out.println("Volume inválido");
        }
    }

    //aumentar volume
    public void aumentarVolume(int aumentar) {
        this.setVolume(this.volume + aumentar);
    }

    //diminuir volume
    public void diminuirVolume(int y){
        this.setVolume(this.volume - y);
    }

    //get retorna
    public int getVolume() {
        return this.volume;
    }

    public void setMarca(String marca){
        if (marca.length() <= 30){
            this.marca = marca;
        } else {
            System.out.println("Marca inválida");
        }
    }

    public void setModelo(String modelo) {
        char primeiro = modelo.charAt(0);
        boolean resp = Character.isUpperCase(primeiro);
        if (resp) {
            this.modelo = modelo;
        }else{
            System.out.println("Modelo inválido");
        }
    }

    public void setConectadaInternet(boolean conectadaInternet) {
        this.conectadaInternet = conectadaInternet;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public boolean conectaInternet(){
        System.out.println("Buscando sinal de wifi");
        System.out.println("Verificando credenciais");
        System.out.println("Autenticando IP no roteador");
        int randomico = (int)(Math.random() * 10);
        if (randomico < 5) {
            System.out.println("Conectado");
            return true;
        }else{
            System.out.println("Erro na conexao");
            return false;
        }
    }

    //abrir youtube
    public void abrirYoutube() {
        //verifica se tem internet
        if (this.conectaInternet()){
            System.out.println("Abrindo youtube");
        } else{
            System.out.println("Youtube nao pode ser aberto, verificar conexao");
        }
    }


}