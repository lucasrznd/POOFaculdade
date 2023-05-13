package br.edu.unifio.Ex4;

public class Wolf extends Canine{

    @Override
    public void makeNoise() {
        System.out.println("O lobo está uivando.");
    }

    @Override
    public void eat() {
        System.out.println("O lobo está comendo carne.");
    }
}
