import java.util.Scanner;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String userInput = console.nextLine();
        String specifiedWord = console.nextLine();
        String[] arr = userInput.toLowerCase().split("\\W+");
        int counter = 0;
        for (String s : arr) {
            if (specifiedWord.toLowerCase().equals(s)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}

