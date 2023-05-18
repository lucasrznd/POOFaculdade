package br.edu.unifio.Ex6;

public class Gerente extends Funcionario{
    private String area;

    public Gerente() {
        super();
    }

    public Gerente(String nome, Data dataNascimento, double salario, String area) {
        super(nome, dataNascimento, salario);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public double calcularImposto() {
        return getSalario() * 0.05;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("\nSalário: " + (getSalario() -   calcularImposto()));
    }
}
