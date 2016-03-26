import java.util.ArrayList;
import java.util.Scanner;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String userInput = console.nextLine();
        String[] numbersAsString = userInput.split(" ");
        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i <numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }

        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> longest = new ArrayList<>();

        System.out.print(numbers[0]);
        temp.add(numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > numbers[i-1]){
                temp.add(numbers[i]);
                System.out.printf(" %d", numbers[i]);
                if(longest.size() < temp.size() && i == numbers.length-1){
                    longest.clear();
                    longest.addAll(0, temp);
                }

            } else{
                if(longest.size() < temp.size()){
                    longest.clear();
                    longest.addAll(0, temp);
                }
                temp.clear();
                temp.add(numbers[i]);
                System.out.println();
                System.out.printf("%d", numbers[i]);
            }
        }

        System.out.println();
        System.out.print("Longest: ");
        for (Integer integer : longest) {
            System.out.print(integer + " ");
        }
    }
}

