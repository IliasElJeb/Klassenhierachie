package be.intecbrussel.animals;

public class Animal {
    private String name;

    public Animal(){

    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move(){
        System.out.println("The animal is moving");
    }
    public void makeNoise(){
        System.out.println("The animal is making noise");
    }
}

