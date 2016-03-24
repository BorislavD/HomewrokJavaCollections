import java.util.Scanner;

public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String userInput = console.nextLine();
        String[] arr = userInput.split(" ");
        System.out.print(arr[0] + " ");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].equals(arr[i-1])) {
                System.out.print(arr[i-1] + " ");
            } else{
                System.out.println();
                System.out.print(arr[i] + " ");
            }
        }
    }
}
