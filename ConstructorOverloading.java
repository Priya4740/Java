import java.io.*;
import java.util.*;
class Circle extends Object{
    double r;
    Circle(){
        r=0;
    }
    Circle(double r){
        this.r=r;
    }
    Circle(Circle op){
        this.r=op.r;
    }
    double area(){
        return(22/7.0)*r*r;
    }
    double area(double x){
    return(22/7.0)*x*x;
    }
    void setCircle(double r){
        this.r=r;
    }
}
public class CircleMain{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Circle c1=new Circle();
        System.out.println("After default constructor, Area of first circle is "+c1.area());
        System.out.println("Enter radius of first circle");
        double radius=sc.nextDouble();
        c1.setCircle(radius);
        System.out.println("Now area of first circle is "+c1.area());
        Circle c2=new Circle(8.8);
        System.out.println("Area of the second circle is "+c2.area());
        Circle c3=new Circle(c2);
        System.out.println("Area of the third circle is "+c3.area());
        System.out.println("Area of the first circle with radius 7.0 is "+c1.area(7.0));
    }
}
