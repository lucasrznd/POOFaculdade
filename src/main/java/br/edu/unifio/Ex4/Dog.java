package br.edu.unifio.Ex4;

public class Dog extends Canine {

    @Override
    public void makeNoise() {
        System.out.println("O cachorro está latindo.");
    }

    public void eat() {
        System.out.println("O cachorro está comendo ração.");
    }
}
