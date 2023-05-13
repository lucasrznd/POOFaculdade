package br.edu.unifio.Ex4;

public class Cat extends Feline {

    @Override
    public void makeNoise() {
        System.out.println("O gato está miando.");
    }

    @Override
    public void eat() {
        System.out.println("O gato está comendo sardinha.");
    }
}
