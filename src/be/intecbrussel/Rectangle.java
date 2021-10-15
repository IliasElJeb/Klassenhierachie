package be.intecbrussel;

public class Rectangle {
    private double length; // default = 0
    private double width; // default = 0

    public void setLength(double length2) {
        if (length2 < 0) {
            length = -length2;
        } else {
             length = length2;
        }
    }

    public void setWidth(double width2) {
        if (width2 < 0) {
            width = -width2;
        } else {
            width = width2;
        }
    }

    public double getLength(){
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea(){
        double area = length * width;
        return area;
    }

    public double getCircumference() {
        double circumference = (length * 2) + (width * 2);
        return circumference;
    }
}
