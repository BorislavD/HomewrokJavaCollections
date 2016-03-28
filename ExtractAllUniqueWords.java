import java.util.Scanner;
import java.util.TreeSet;

public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String userInput = console.nextLine();
        String[] arr = userInput.split("\\W+");
        TreeSet<String> uniqueWords = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {
            uniqueWords.add(arr[i].toLowerCase());
        }

        for (String uniqueWord : uniqueWords) {
            System.out.printf("%s ", uniqueWord);
        }

    }
}
