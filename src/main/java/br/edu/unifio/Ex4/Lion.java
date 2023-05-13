package br.edu.unifio.Ex4;

public class Lion extends Feline{

    @Override
    public void makeNoise() {
        System.out.println("O leão está rugindo.");
    }

    @Override
    public void eat() {
        System.out.println("O leão está comendo carne.");
    }
}
