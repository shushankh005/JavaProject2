public class IntLargerThanPreviousFromArray {
    public static void main(String[] args) {
        int[] arrmix = {8, 11, -6, 52, 61, 99, -77, 0, 100, 15};
        int k = 0;
        System.out.print("The quantity of numbers greater than the previous one will be: ");
        for (int i = 1; i < arrmix.length; i++) {
            if (arrmix[i] > arrmix[i - 1]) {
                k++;
            }
        }
        System.out.print(k);

    }
}
