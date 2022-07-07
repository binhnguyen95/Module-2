import java.util.Scanner;

public class VD2 {
    public static void main(String[] args) {
        System.out.println("In bang cuu chuong");
        Scanner check = new Scanner(System.in);
        int Num = check.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(Num + " * " + i + " = " + Num * i);
        }
    }
}
