public class PrimeNumber {
    public static void main(String[] args) {
        int[] array = {8, 2, 555, 7, 1, 27};
        System.out.print("The Prime Numbers from array are { ");

        for (int i = 0; i < array.length; i++) {
            boolean isPrime = true;
            if (array[i] == 1)
                isPrime = false;
            else {
                for (int j = 2; j <= array[i] / 2; j++) {
                    if (array[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                if (array[i] == 0) {
                } else {
                    System.out.print(array[i] + ",");
                }
            }
        }
        System.out.println(" } ");
    }
}