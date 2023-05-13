package br.edu.unifio.Ex4;

public class Tiger extends Feline{

    @Override
    public void makeNoise() {
        System.out.println("O tigre está rugindo.");
    }

    @Override
    public void eat() {
        System.out.println("O tigre está comendo carne.");
    }
}
