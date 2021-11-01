package be.intecbrussel.animals;


public class Bird extends Animal {

    public Bird() {
    }

    public Bird(String name) {
        super(name);
    }

    public void move() {
        System.out.println("Bird is flying");
    }

    public void makeNoise() {
        System.out.println("Bird says: rooooooh");
    }

}



