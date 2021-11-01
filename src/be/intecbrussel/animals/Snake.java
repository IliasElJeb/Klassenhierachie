package be.intecbrussel.animals;

public class Snake extends Animal {

    public Snake() {
    }

    public Snake(String name) {
        super(name);
    }

    public void move() {
        System.out.println("Snake is sliding");
    }

    public void makeNoise() {
        System.out.println("Snake says: pssssss");
    }

}


