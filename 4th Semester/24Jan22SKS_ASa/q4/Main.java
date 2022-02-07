// package q4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        final float pi = 3.14f;
        System.out.print("Enter radius = ");
        float radius;
        Scanner in = new Scanner(System.in);
        radius = in.nextFloat();
        System.out.println("The area of the circle is = " + pi*radius*radius + " sq. units.");
    }
}
