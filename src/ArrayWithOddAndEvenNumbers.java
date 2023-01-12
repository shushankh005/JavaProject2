public class ArrayWithOddAndEvenNumbers {
    public static void main(String[] args) {

        int[] arr1 = {8, -6, -7, 10, -6, 1, 0};
        int[] arr2 = {13, 4, 25, -9, 2, 3, 5};
        int[] arr3 = new int[arr1.length];

        System.out.print("int[] arr3 = ");

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 1 && arr2[i] % 2 == 1) {
                arr3[i] = arr1[i];
            } else if (arr1[i] % 2 == 0 && arr2[i] % 2 == 0) {
                arr3[i] = arr2[i];
            } else {
                arr3[i] = 0;
            }
            System.out.print(arr3[i] + ",");

        }

    }
}
