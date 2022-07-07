package QuadraticEquation;

public class QuadraticEquation {
    public double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void getValue(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = (b * b) - (4 * a * c);
        return delta;
    }

    public double getRoot1() {
        double root1 = (-b + Math.pow(getDiscriminant(), 0.5)) / 2 * a;
        return root1;
    }

    public double getRoot2() {
        double root2 = (-b - Math.pow(getDiscriminant(), 0.5)) / 2 * a;
        return root2;
    }
}
