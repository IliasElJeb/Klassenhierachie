package be.intecbrussel.animals;


public class Fish extends Animal {


    public Fish() {
    }

    public Fish(String name) {
        super(name);
    }

    public void move() {
        System.out.println("Fish is swimming");
    }

    public void makeNoise() {
        System.out.println("Fish says: Bloup");
    }

}



