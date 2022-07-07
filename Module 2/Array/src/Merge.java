

public class Merge {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 60};
        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr3.length; i++) {
            if (i < arr1.length) {
                arr3[i] = arr1[i];
            }
            else if (i >= arr1.length) {
                arr3[i] = arr2[i - arr2.length];
            }
            System.out.print(arr3[i] + " ");
        }
    }
    }
