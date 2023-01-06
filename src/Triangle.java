import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Print 3 values for valid triangle");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("We will have a valid triangle");
        } else {
            System.out.println("We will have an invalid triangle");
        }
    }
}

