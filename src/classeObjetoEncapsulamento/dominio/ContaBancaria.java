package classeObjetoEncapsulamento.dominio;

public class ContaBancaria {
    protected String titular;
    protected String cpf;
    protected double saldo;

    public ContaBancaria(String titular, String cpf, double saldo) {
        this.titular = titular;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Titular: " + this.titular + "\n" + "Cpf do Titular: " + this.cpf + "\n" + "Saldo: " + this.saldo;
    }

    public void abrirConta(){
        System.out.println("Conta aberta");
        System.out.println(toString());
    }

    public void depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
        }
    }

    public void verificaSaldo(){
        System.out.println("Saldo Atual: " + this.saldo);
    }

    public void fecharConta(){
        if (this.saldo == 0){
            System.out.println("Conta fechada");
        }else {
            System.out.println("A conta não pode ser fechada pois ainda a saldo disponível!");
        }
    }
}
