package br.edu.unifio.Ex6;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoa {
    private int qtdAtual;
    List<Pessoa> pessoas = new ArrayList<>();

    public CadastroPessoa() {

    }

    public CadastroPessoa(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public void cadastrarPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    public void imprimirCadastro() {
        for(Pessoa p : pessoas) {
            p.imprimirDados();
        }
    }
}
