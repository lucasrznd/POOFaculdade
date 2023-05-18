package br.edu.unifio.Ex6;

public class Pessoa {
    private String nome;
    private Data dataNascimento;

    public Pessoa() {

    }

    public Pessoa(String nome, Data dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + getNome()
                + "\nData de Nascimento: " + getDataNascimento());
    }
}
