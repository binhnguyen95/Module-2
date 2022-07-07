import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("Nhập số");
        int number = check.nextInt();
        if (number <= 10 && number >= 0) {
            String result = "";
            switch (number) {
                case 1 -> result += "One";
                case 2 -> result += "Two";
                case 3 -> result += "Three";
                case 4 -> result += "Four";
                case 5 -> result += "Five";
                case 6 -> result += "Six";
                case 7 -> result += "Seven";
                case 8 -> result += "Eight";
                case 9 -> result += "Nine";
                case 10 -> result += "Ten";
            }
            System.out.println(result);
        }

        if (number < 20) {
            String result = "";
            switch (number) {
                case 11 -> result += "Eleven";
                case 12 -> result += "Twelve";
                case 13 -> result += "Thirteen";
                case 14 -> result += "Fourteen";
                case 15 -> result += "Fifteen";
                case 16 -> result += "Sixteen";
                case 17 -> result += "Seventeen";
                case 18 -> result += "Eighteen";
                case 19 -> result += "Nineteen";
            }
            System.out.println(result);
        }

        if (number >= 20) {
            String result = "";
            switch (number) {
                case
            }
        }
    }
}
