package br.edu.unifio.Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> valores = new ArrayList<Integer>();

        for(int i = 0; i<5; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            int numero = sc.nextInt();
            valores.add(numero);
        }
        System.out.println("\nContéudo do Array list:");
        for(Integer elemento: valores) {
            System.out.println(elemento);
        }
        sc.close();
    }
}