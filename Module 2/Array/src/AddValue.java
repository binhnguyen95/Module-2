import java.util.Scanner;

public class AddValue {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Nhap vi tri index can them");
            int X = scanner.nextInt();

            System.out.println("Nhap gia tri can them");
            int value =scanner.nextInt();

            int[] arr = {1,2,3,4,5,11,44,22};
            int[] arr1 = addByIndex(arr, X, value);
            for (int print: arr1) {
                System.out.print(print + "\t");
            }
    }
    public static int[] addByIndex(int[] array, int index, int addValue) {
        int N = array.length;
        int newArray[] = new int[N + 1];

        if ( index < 0) {
            System.out.println("Fail");
        }

        for (int i = 0; i <= index; i++) {
            newArray[i] = array[i];
        }

        newArray[index] = addValue;

        for (int i = index + 1; i < N + 1; i++) {
            newArray[i] = array[i - 1];
        }
        return newArray;
    }
}
