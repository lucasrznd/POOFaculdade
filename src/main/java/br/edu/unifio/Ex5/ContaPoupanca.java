package br.edu.unifio.Ex5;

public class ContaPoupanca extends Conta {

    public void atualizar(double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }
}
