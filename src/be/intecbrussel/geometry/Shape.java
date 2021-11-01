package be.intecbrussel.geometry;

public abstract class Shape {
    private int count;
    private int x;
    private int y;


    public Shape() {
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getArea() {
        return getArea();
    }

    public double getPerimeter() {
        return getPerimeter();
    }
    public int getCount(){
        return count;
    }
}

