import java.util.Scanner;

public class findMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Giá trị nhỏ nhất là " + min);

    }

}
