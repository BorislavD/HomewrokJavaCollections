import java.util.Scanner;

public class StuckNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = console.nextInt();
        }

        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                for (int k = 0; k < numbers.length; k++) {
                    for (int l = 0; l < numbers.length; l++) {
                        int a = numbers[i];
                        int b = numbers[j];
                        int c = numbers[k];
                        int d = numbers[l];
                        if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d){
                            String left = a + "" + b;
                            String right = c + "" + d;
                            if(left.equals(right)) {
                                System.out.printf("%d|%d==%d|%d\n", a, b, c, d);
                                counter++;
                            }
                        }
                    }
                }
            }
        }

        if(counter == 0){
            System.out.println("No");
        }
    }
}
