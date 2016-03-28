import java.util.ArrayList;
import java.util.Scanner;

public class CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<Character> firstList = new ArrayList<>();
        ArrayList<Character> secondList = new ArrayList<>();
        ArrayList<Character> result = new ArrayList<>();

        for (Character character : console.nextLine().toCharArray()) {
            firstList.add(character);
        }

        for (Character character : console.nextLine().toCharArray()) {
            secondList.add(character);
        }

        result.addAll(firstList);

        for (int i = 0; i <secondList.size() ; i++) {
            if(!firstList.contains(secondList.get(i))){
                result.add(' ');
                result.add(secondList.get(i));
            }
        }

        for (Character character : result) {
            System.out.print(character);
        }
    }
}

