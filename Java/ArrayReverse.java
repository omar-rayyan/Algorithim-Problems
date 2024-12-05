import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverseArrayTwoPointers(arr);
        System.out.println("Reversed Array (Two Pointers): " + Arrays.toString(arr));

        arr = new int[]{1, 2, 3, 4, 5};

        reverseArrayRecursively(arr, 0, arr.length - 1);
        System.out.println("Reversed Array (Recursion): " + Arrays.toString(arr));
    }

    public static void reverseArrayTwoPointers(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }
    }

    public static void reverseArrayRecursively(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseArrayRecursively(arr, left + 1, right - 1);
    }
}