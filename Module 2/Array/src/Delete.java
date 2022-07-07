import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        int[] arr = {1,2,3,4,5,11,44,22};
        int[] arr1 = deleteByIndex(arr, X);
        for (int print: arr1) {
            System.out.print(print + "\t");
        }

    }

    public static int[] deleteByIndex(int[] array, int index) {
        int n = array.length;
        int newArray[] = new int[n-1];
        if ( index < 0) {
            System.out.println("Fail");
        }
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = index; i < n - 1; i++) {
            newArray[i] = array[i + 1];
        }
        return newArray;
    }
}
