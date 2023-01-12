public class ReplacementOfNegativeNumbers {
    public static void main(String[] args) {

        int[] arrmix = {12, 5, -6, -5, 8, 98, -77, 0, -10, 15};
        int n = 0; //The negative numbers initialization

        System.out.print("Array of negative numbers modulo will be {");

        for (int i = 0; i < arrmix.length; i++) {
            if (arrmix[i] < 0) {
                arrmix[i] = -1 * arrmix[i];
                n++;
            }
            System.out.print(arrmix[i] + ",");
        }
        System.out.println("}");
        System.out.println("The number of modulo changes will be " + n);
        System.out.println("The number of non-negative members of the arrmix will be " + (arrmix.length - n));
    }
}
