public class Conta {
    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    public Conta (int numeroConta, int agencia, String nomeCliente, float saldo, boolean status){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
    }

    public void depositar(float valor){
        if (status) {
            saldo += valor;
            System.out.println("Valor depositado com sucesso");
        }else {
            System.out.println("Conta nao está ativa");
        }
    }

    public void sacar(float x) {
        if (!status) {
            System.out.println("Conta inativa");
        } else if (saldo < x) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= x;
            System.out.println("Saque de R$ " + x + " realizado com sucesso.");
        }
    }

    public void encerrarConta(){
        if (this.saldo == 0) {
            this.status = false;
            System.out.println("Conta encerrada com sucesso.");
        } else {
            System.out.println("Erro: Você precisa sacar o valor de R$ " + this.saldo + " antes de encerrar.");
        }
    }

    public String toString() {
        return  "\nCliente: " + this.nomeCliente +
                "\nConta: " + this.numeroConta + " | Agência: " + this.agencia +
                "\nSaldo Atual: R$ " + this.saldo +
                "\nStatus: " + (this.status ? "Ativa" : "Encerrada") +
                "\n------------------------";
    }
}



