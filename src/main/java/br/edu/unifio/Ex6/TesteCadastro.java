package br.edu.unifio.Ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteCadastro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão cadastradas?: ");
        int qtdPessoa = sc.nextInt();
        CadastroPessoa cadastro = new CadastroPessoa(qtdPessoa);

        for(int i = 1; i <= qtdPessoa; i++) {
            System.out.println("\nDados da pessoa #" + i + ": ");
            System.out.print("Selecione o tipo de pessoa (c/f/g): ");
            char tipoPessoa = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.println("--Data de Nascimento--");
            System.out.print("Dia: ");
            int dia = sc.nextInt();
            System.out.print("Mês: ");
            int mes = sc.nextInt();
            System.out.print("Ano: ");
            int ano = sc.nextInt();
            Data dataNascimento = new Data(dia, mes, ano);
            if(tipoPessoa == 'c') {
                System.out.print("Código: ");
                int codigo = sc.nextInt();
                Cliente cliente = new Cliente(nome, dataNascimento, codigo);
                cadastro.cadastrarPessoa(cliente);
            } else if(tipoPessoa == 'f') {
                System.out.print("Salário R$ ");
                double salario = sc.nextDouble();
                Funcionario funcionario = new Funcionario(nome, dataNascimento, salario);
                cadastro.cadastrarPessoa(funcionario);
            } else {
                System.out.print("Salário R$ ");
                double salario = sc.nextDouble();
                System.out.print("Area: ");
                String area = sc.next();
                Gerente gerente = new Gerente(nome, dataNascimento, salario, area);
                cadastro.cadastrarPessoa(gerente);
            }
        }
        cadastro.imprimirCadastro();
    }
}
