import java.util.Scanner;

public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String userInput = console.nextLine();
        String[] arr = userInput.split(" ");
        String firstElement = arr[0];
        int longest = 1;
        int counter = 1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1].equals(arr[i])){
                counter++;
                if(counter > longest){
                    firstElement = arr[i];
                    longest = counter;
                }
            }else {
                if(counter > longest){
                    firstElement = arr[i];
                    longest = counter;
                }

                counter = 1;
            }
        }

        for (int i = 0; i < longest; i++) {
            System.out.print(firstElement + " ");
        }
    }
}

