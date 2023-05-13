package br.edu.unifio.Ex5;

public class TestaConta {

    public static void main(String[] args) {

        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        c.depositar(1000);
        cc.depositar(1000);
        cp.depositar(1000);

        c.atualizar(0.01);
        cc.atualizar(0.01);
        cp.atualizar(0.01);

        System.out.println("Saldo Conta: " + c.getSaldo());
        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo Conta Poupança: " + cp.getSaldo());
    }
}
