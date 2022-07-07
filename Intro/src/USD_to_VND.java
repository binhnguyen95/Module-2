import java.util.Scanner;

public class USD_to_VND {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long VND, USD, rate;
        System.out.println("Enter USD");
        USD = input.nextLong();
        VND = 23000;
        rate = USD * VND;
        System.out.println(USD + " USD is " + rate + "VND");
    }
}
