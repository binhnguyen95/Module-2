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

        QuadraticEquation calculator = new QuadraticEquation(a, b, c);

        double delta = calculator.getDiscriminant();
        double root1 = calculator.getRoot1();
        double root2 = calculator.getRoot2();

        System.out.println(root1);
    }
}
