import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fill in the character of your choice!");
        char p = scanner.next().charAt(0); //preferred character
        char[] array = {'k', 'o', 'f', 'q', 'x', 'l', 'w'};
        int i = 0;
        while (true) {
            if (p == array[i]) {
                System.out.println("The index of where the character is found is " + i);
                break;
            } else if (i == array.length - 1) {
                System.out.println("The character not found!");
                break;
            }
            i++;
        }
    }
}