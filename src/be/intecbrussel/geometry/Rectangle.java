package be.intecbrussel.geometry;

public class Rectangle extends Shape {
    private int count;
    public final int ANGLES = 4;
    private int width;
    private int height;

    public Rectangle() {

    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x, int y, int count, int width, int height) {
        super(x, y);
        this.count = count;
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle r) {

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getArea() {

        return height * width;
    }

    public double getPerimeter() {

        return (height + width) * 2;
    }
    public void grow(int d){

    }
    public static int getCount(){

        return count;
    }
}