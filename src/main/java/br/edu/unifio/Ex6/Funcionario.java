package br.edu.unifio.Ex6;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, Data dataNascimento, double salario) {
        super(nome, dataNascimento);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularImposto() {
        return getSalario() * 0.03;
    }

    @Override
    public void imprimirDados() {
        System.out.println("\nDados do Funcionário: ");
        super.imprimirDados();
        System.out.println("Salário: " + (getSalario() -   calcularImposto()));
    }
}
