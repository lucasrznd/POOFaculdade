package br.edu.unifio.Ex5;

public class Conta {

    protected double saldo;

    public Conta() {

    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if(valor <= saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Impossível realizar operação");
        }
    }

    public void atualizar(double taxa) {
        this.saldo += this.saldo * taxa;
    }
}
