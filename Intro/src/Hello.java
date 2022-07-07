import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("Enter your name");
        String display = check.nextLine();
        System.out.println("Hello " + display);
    }
}
