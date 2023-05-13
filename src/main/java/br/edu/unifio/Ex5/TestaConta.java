package br.edu.unifio.Ex5;

import java.util.Locale;

public class TestaConta {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        c.depositar(1000);
        cc.depositar(1000);
        cp.depositar(1000);

        c.atualizar(0.01);
        cc.atualizar(0.01);
        cp.atualizar(0.01);

        System.out.println("Saldo Conta: " + String.format("%.2f", c.getSaldo()));
        System.out.println("Saldo Conta Corrente: " + String.format("%.2f", cc.getSaldo()));
        System.out.println("Saldo Conta Poupança: " + String.format("%.2f", cp.getSaldo()));
    }
}
