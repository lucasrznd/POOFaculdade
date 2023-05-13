package br.edu.unifio.Ex3;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private double altura;
    private int idade;
    private static final int ANO_ATUAL = 2023;

    public Pessoa(String nome, String dataNascimento, double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public int calcularIdade() {
        String ano = this.dataNascimento.substring(6);
        int anoNascimento = Integer.parseInt(ano);
        return idade = ANO_ATUAL - anoNascimento;
    }

    public String toString() {
        return "\nNome: " + getNome() + "\nData de nascimento: " + getDataNascimento() +
                "\nAltura: " + String.format("%.2f",getAltura()) + "\nA pessoa tem " + this.idade + " anos";
    }
}
