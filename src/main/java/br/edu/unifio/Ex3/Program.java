package br.edu.unifio.Ex3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite a sua data de nascimento: ");
        String dataNascimento = sc.nextLine();
        System.out.print("Digite a sua altura: ");
        double altura = sc.nextDouble();

        Pessoa pessoa = new Pessoa(nome, dataNascimento, altura);
        pessoa.calcularIdade();

        System.out.println(pessoa);
    }
}
