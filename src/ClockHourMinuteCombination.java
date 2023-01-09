import java.util.Scanner;

public class ClockHourMinuteCombination {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Clock hour-minute combination for 1-12 sections");
        int d = s.nextInt();
        if (d >= 1 && d <= 11) {
            System.out.println("Choosing section " + d + ", the minute hand will show " + d * 5 + "th minute");}
        else if (d==12) {
            System.out.println("Choosing section " + d + " , it will be a round hour");}
        else {
            System.out.println("Error!");}
    }
}

