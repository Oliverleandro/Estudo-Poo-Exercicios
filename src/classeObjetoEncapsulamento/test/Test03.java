package classeObjetoEncapsulamento.test;

import classeObjetoEncapsulamento.dominio.ContaBancaria;

public class Test03 {
    public static void main(String[] args) {
        ContaBancaria contaBancaria01 = new ContaBancaria("Leandro", "187.988.477.16", 3500);
        contaBancaria01.abrirConta();
        System.out.println("---------------------");
        contaBancaria01.depositar(1000);
        contaBancaria01.verificaSaldo();
        contaBancaria01.sacar(350);
        contaBancaria01.verificaSaldo();
        contaBancaria01.sacar(4150);
        contaBancaria01.verificaSaldo();
        contaBancaria01.fecharConta();
    }
}
