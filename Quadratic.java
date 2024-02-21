import java.util.Scanner;

public class Quadratic{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the coefficients of the quadratic equation (ax^2 + bx + c = 0):");
        System.out.print("a: ");
        int a = s.nextInt();
        System.out.print("b: ");
        int b = s.nextInt();
        System.out.print("c: ");
        int c = s.nextInt();

        int dt = b * b - 4 * a * c;

        if (dt > 0) {
	    System.out.println("It has real and distinct roots");
            double r1 = (-b + Math.sqrt(dt)) / (2 * a);
            double r2 = (-b - Math.sqrt(dt)) / (2 * a);
            System.out.println("The roots are " +r1+ " and " +r2);
        } else if (dt == 0) {
	    System.out.println("It has real and equal roots");
            double rt = -b / (2 * a);
            System.out.println("The roots are " +rt+ " and " +rt);
        } else {
            System.out.println("It has no real roots.");
        }

        s.close();
    }
}
