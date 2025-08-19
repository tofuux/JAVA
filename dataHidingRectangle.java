
import java.util.Scanner;

class Rectangle{
    private double length;
    private double breadth;

    public double getLength(){
        return length;
    }
    public void setLength(double l){
        length = l;
    }
    public double getbreadth(){
        return breadth;
    }
    public void setbreadth(double b){
        breadth = b;
    }    
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*length+2*breadth;
    }  
    public boolean isSquare(){
        if(length==breadth)
            return true;
        return false;
    }
}
public class dataHidingRectangle {
    public static void main(String[] args) {
    System.out.print("Enter length: ");
    Scanner sc = new Scanner(System.in);
    double len = sc.nextDouble();
    System.out.print("Enter breadth: ");
    double bre = sc.nextDouble();
    
    Rectangle rect = new Rectangle();
    rect.setbreadth(bre);
    rect.setLength(len);

    System.out.println("Area: "+rect.area());
    System.out.println("Perimeter: "+ rect.perimeter());
    System.out.println("It is a square: " + rect.isSquare());
            
    }    
}
