public class ArrayBesideCycle {
    public static void main(String[] args) {
        double[] input = {8.9, -6.8, -9.8, 2.2, -6.9};
        double[] output = new double[5];
        int m = 0;
        int n = 0;
        if (input[m] >= 0) {
            output[n] = input[m];
            n++;
        }
        m++;
        if (input[m] >= 0) {
            output[n] = input[m];
            n++;
        }
        m++;
        if (input[m] >= 0) {
            output[n] = input[m];
            n++;
        }
        m++;
        if (input[m] >= 0) {
            output[n] = input[m];
            n++;
        }
        m++;
        if (input[m] >= 0) {
            output[n] = input[m];
            n++;
        }

        System.out.println("Input will be {" + input[0] + "," + input[1] + "," + input[2] + "," + input[3] + "," + input[4] + "}");
        System.out.println("Output will be {" + output[0] + "," + output[1] + "," + output[2] + "," + output[3] + "," + output[4] + "}");

    }
}
