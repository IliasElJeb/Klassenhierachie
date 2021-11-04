package be.intecbrussel.geometry;

import static java.lang.Math.sqrt;

public class Triangle extends Shape {

    public final int ANGLES = 3;
    private int count;
    private int height;
    private int width;
    private int perpendicular;


    public Triangle() {

    }

    public Triangle(int w, int h, int p) {

    }

    public Triangle(int w, int h, int p, int x, int y) {
        super(x, y);

    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPerpendicular() {

        return perpendicular;
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = perpendicular;
    }

    public double getArea() {
        return (width * height) / 2;
    }

    public double getPerimeter() {

        return width + width + width;
    }

    public static int getCount() {
        return count;


    }

}

