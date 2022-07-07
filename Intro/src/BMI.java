import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        float weight, height, bmi;
        System.out.println("Nhap can nang:");
        weight = check.nextFloat();
        System.out.println("Nhap chieu cao:");
        height = check.nextFloat();
        bmi = weight/(height*height);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi < 25.0) {
            System.out.println("Normal");
        }
        else if (bmi < 30.0) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}
