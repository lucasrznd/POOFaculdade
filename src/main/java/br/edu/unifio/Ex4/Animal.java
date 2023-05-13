package br.edu.unifio.Ex4;

public class Animal {
    private String picture;
    private String food;
    private String hunger;
    private String boundaries;
    private String location;

    public Animal() {

    }

    public Animal(String picture, String food, String hunger, String boundaries, String location) {
        this.picture = picture;
        this.food = food;
        this.hunger = hunger;
        this.boundaries = boundaries;
        this.location = location;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getHunger() {
        return hunger;
    }

    public void setHunger(String hunger) {
        this.hunger = hunger;
    }

    public String getBoundaries() {
        return boundaries;
    }

    public void setBoundaries(String boundaries) {
        this.boundaries = boundaries;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Som emitido pelo animal.");
    }

    public void eat() {
        System.out.println("O animal está se alimentando.");
    }

    public void sleep() {
        System.out.println("O animal está dormindo.");
    }

    public void roam() {
        System.out.println("O animal está vagando.");
    }
}
