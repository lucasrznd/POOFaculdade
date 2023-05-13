package br.edu.unifio.Ex4.application;

import br.edu.unifio.Ex4.*;

public class Program {

    public static void main(String[] args) {

        System.out.println("\nAnimal: ");
        Animal animal = new Animal();
        animal.makeNoise();
        animal.eat();

        System.out.println("\nFelino: ");
        Feline feline = new Feline();
        feline.makeNoise();
        feline.eat();

        System.out.println("\nLeão: ");
        Lion lion = new Lion();
        lion.makeNoise();
        lion.eat();

        System.out.println("\nTigre: ");
        Tiger tiger = new Tiger();
        tiger.makeNoise();
        tiger.eat();

        System.out.println("\nGato: ");
        Cat cat = new Cat();
        cat.makeNoise();
        cat.eat();

        System.out.println("\nHippo: ");
        Hippo hippo = new Hippo();
        hippo.makeNoise();
        hippo.eat();

        System.out.println("\nCanino: ");
        Canine canine = new Canine();
        canine.roam();

        System.out.println("\nCachorro: ");
        Dog dog = new Dog();
        dog.makeNoise();
        dog.eat();

        System.out.println("\nLobo: ");
        Wolf wolf = new Wolf();
        wolf.makeNoise();
        wolf.eat();
    }
}
