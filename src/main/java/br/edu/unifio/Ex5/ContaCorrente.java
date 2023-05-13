package br.edu.unifio.Ex5;

public class ContaCorrente extends Conta{

    @Override
    public void atualizar(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor - 0.10;
    }
}
