public class FechaduraEletronica implements Autenticavel, DispositivoLigavel {
    private boolean trancada = true;
    private String senhaMestra = "1234";
    private boolean acessoPermitido = false;

    @Override
    public void validarAcesso(String senha) {
        if (this.senhaMestra.equals(senha)) {
            this.acessoPermitido = true;
            System.out.println("Senha correta! Acesso liberado.");
        } else {
            this.acessoPermitido = false;
            System.out.println("Senha incorreta! Acesso negado.");
        }
    }

    @Override
    public void ligar() {
        if (acessoPermitido) {
            this.trancada = false;
            System.out.println("Fechadura: Porta DESTRANCADA.");
        } else {
            System.out.println("Erro: Valide o acesso antes de destrancar.");
        }
    }

    @Override
    public void desligar() {
        this.trancada = true;
        this.acessoPermitido = false; // Reseta o acesso por segurança
        System.out.println("Fechadura: Porta TRANCADA.");
    }
}