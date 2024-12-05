import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverseArrayTwoPointers(arr);
        System.out.println("Reversed Array (Two Pointers): " + Arrays.toString(arr));

        arr = new int[]{1, 2, 3, 4, 5};

        reverseArrayUsingTempArray(arr);
        System.out.println("Reversed Array (Temp Array): " + Arrays.toString(arr));
    }

    public static void reverseArrayTwoPointers(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }
    }

    public static void reverseArrayUsingTempArray(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - 1 - i];
        }
        System.arraycopy(temp, 0, arr, 0, arr.length);
    }
}