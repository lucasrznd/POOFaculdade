package br.edu.unifio.Ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int posicao;
        int acaoUsuario;

        System.out.println("Bem-vindo à Agenda!");
        System.out.println("1 - Adicionar Contato");
        System.out.println("2 - Editar Contato");
        System.out.println("3 - Remover Contato");
        System.out.println("4 - Buscar Contato");
        System.out.println("5 - Exibir todos");
        System.out.println("0 - Sair");

        ArrayList<String> contato = new ArrayList<>();
        do {
            System.out.print("\nO que deseja fazer?: ");
            acaoUsuario = sc.nextInt();

            if (acaoUsuario == 1) {
                sc.nextLine();
                System.out.print("\nDigite o nome do contato: ");
                nome = sc.nextLine();
                contato.add(nome);
                System.out.println("Contato adicionado com sucesso.");
            }

            if(acaoUsuario == 2) {
                System.out.println("Digite a posição do contato que deseja editar: ");
                posicao = sc.nextInt();
                sc.nextLine();
                System.out.println("\nDigite o nome: ");
                nome = sc.nextLine();
                contato.set(posicao, nome);
                System.out.println("Dados atualizados com sucesso.");
            }

            if(acaoUsuario == 3) {
                System.out.println("\nDigite a posição do contato que deseja remover: ");
                posicao = sc.nextInt();
                contato.remove(posicao);
                System.out.println("Contato removido com sucesso.");
            }

            if(acaoUsuario == 4) {
                sc.nextLine();
                System.out.println("Digite o nome do contato: ");
                String nomeBusca = sc.nextLine();
                posicao = contato.indexOf(nomeBusca);

                if(posicao >= 0) {
                    System.out.println("O contato " + nomeBusca + " está na posição: "
                            + posicao);
                } else {
                    System.out.println("Nome não encontrado.");
                }
            }

            if(acaoUsuario == 5) {
                System.out.println("\nLista de contatos: ");
                for(String elemento: contato) {
                    System.out.println(contato.indexOf(elemento) + " - " + elemento);
                }
            }
        } while(acaoUsuario != 0);
        sc.close();
    }
}
