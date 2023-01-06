public class AvaragAndDecimalPart {
    public static void main(String[] args) {
        //-----------------------------------------------------

        int x = 5;
        int y = 2;
        System.out.println((double) x / y == x / y);

        // -----------------------------------------------------

        int a = 4;
        int b = 8;
        int c = 7;
        int d = 5;
        int e = 10;
        int f = 16;
        double k = (double) (a + b + c) / 3;
        double m = (double) (d + e + f) / 3;
        System.out.println("The exact average of a , b , c = " + k);
        System.out.println("The exact average of d , e , f = " + m);
        System.out.println("Integer part of the arithmetic mean of k and m = " + (int) ((k + m)) / 2);

        //----------------------------------------------------

        double z = 48.56;
        int h = (int) z;
        System.out.println("Decimal part of z will be " + (z - h));

        //-----------------------------------------------------

    }
}