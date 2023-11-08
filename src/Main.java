import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String initWord;
        String palReverse = "";
        String reverser;
        int palCheck;

        System.out.println("Please enter a word: ");
        initWord = scan.nextLine();
        for(int i = initWord.length()-1; i >= 0; i--) {
            reverser = initWord.substring(i, i+1);
            palReverse += reverser;
        }

        palCheck = initWord.compareTo(palReverse);
        if (palCheck == 0) {
            System.out.println(initWord + " is a palindrome.");
        } else {
            System.out.println(initWord + " is not a palindrome.");
        }
    }
}