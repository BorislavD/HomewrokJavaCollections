import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = console.nextInt();
        }

        Arrays.sort(arr);
        for (int number : arr) {
            System.out.print(number + " ");
        }
    }
}
