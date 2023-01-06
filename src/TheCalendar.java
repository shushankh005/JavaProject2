import java.util.Scanner;

public class TheCalendar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Print month number 1-12, we will see the quantity of days for this month");
        int d = s.nextInt();
        switch (d) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Quantity of days will be" + 31);
                break;
            case 2:
                System.out.println("Quantity of days will be" + 28);
                break;
            case 4, 6, 9, 11:
                System.out.println("Quantity of days will be" + 30);
                break;
            default:
                System.out.println("Input correct data 1-12");
        }
    }
}