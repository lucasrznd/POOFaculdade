package br.edu.unifio.Ex4;

public class Hippo extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("O hippo está grunindo.");
    }

    @Override
    public void eat() {
        System.out.println("O hippo está comendo folha.");
    }
}
