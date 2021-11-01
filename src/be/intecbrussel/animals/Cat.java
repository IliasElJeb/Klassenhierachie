package be.intecbrussel.animals;

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }
    public void move() {
        System.out.println("Cat is running");
    }

    public void makeNoise() {
        System.out.println("Cat says: Miaow");
    }

}
