import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double area,r;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Radius");
        r = scan.nextDouble();
        area = 3.14159*r*r;
        System.out.println("Area is "+area);
    }
}