package QuadraticEquation;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhập a:");
        double a = scan.nextDouble();

        System.out.println("Nhập b:");
        double b = scan.nextDouble();

        System.out.println("Nhập c:");
        double c = scan.nextDouble();

        QuadraticEquation cal = new QuadraticEquation(a, b, c);

        double delta = cal.getDiscriminant();
        double root1 = cal.getRoot1();
        double root2 = cal.getRoot2();

        if (delta > 0) {
            System.out.println(root1 + root2 );
        }
        else if (delta == 0) {
            System.out.println("Hai nghiệm bằng nhau " + root1);
        }
        else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
