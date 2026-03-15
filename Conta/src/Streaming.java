public class Streaming {
    public String usuario, plano, ultimoFilmeAssistido;
    public float mensalidade;
    public boolean ativo;

    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;
        this.ativo = true;
        this.ultimoFilmeAssistido = ""; //começa vazio

        //mensalidade
        if (plano.equalsIgnoreCase("Básico")) {//ignora maisculas ou minusculas
            this.mensalidade = 25.90f;//f pede float
        } else if (plano.equalsIgnoreCase("Premium")) {
            this.mensalidade = 45.90f;
        } else if (plano.equalsIgnoreCase("Família")) {
            this.mensalidade = 60.90f;
        } else {
            this.mensalidade = 0.0f; //plano inexistente
            System.out.println("Plano inválido!");
        }
    }

    public void assistirFilme(String nome) {
        if(!this.ativo) {
            System.out.println("Erro: É necessário pagar a fatura para assistir ao filme");
        }else {
            ultimoFilmeAssistido = nome;
            System.out.println("Assistindo: " + ultimoFilmeAssistido);
        }
    }

    public void cancelarAssinatura() {
        this.ativo = false;
        System.out.println("Assinatura cancelada");
    }

    public String toString() {
        String statusFormatado;
        if (this.ativo) {
            statusFormatado = "Ativo";
        } else {
            statusFormatado = "Suspenso";
        }

        return "\n--- PERFIL STREAMING ---" +
                "\nUsuário: " + this.usuario +
                "\nPlano: " + this.plano +
                "\nMensalidade: R$ " + this.mensalidade +
                "\nStatus: " + statusFormatado +
                "\nÚltimo Filme: " + (this.ultimoFilmeAssistido.equals("") ? "Nenhum" : this.ultimoFilmeAssistido);
    }
}
