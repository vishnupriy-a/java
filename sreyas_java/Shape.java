import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;
import java.lang.Math;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;
/**
 * Shape
 */
interface Shape {
    double area();
    double perimeter();
}

/**
 * Circle
 */
class circle implements Shape{
    private double radius;
    public circle(double radius){
    this.radius=radius;
    }
    public double area(double radius)
    {
        return Math.PI*radius*radius;
    }
    public double perimeter(double radius){
        return 2*Math.PI*radius;
    }
}

class rectangle implements Shape{
    private double length;
    private double breadth;
    public rectangle(double length, double breadth){
    this.length=length;
    this.breadth=breadth;
    }
    public double area(double length, double breadth)
    {
        return length*breadth;
    }
    public double perimeter(double length, double breadth)
    {
        return 2*(length+breadth);
    }
}
   