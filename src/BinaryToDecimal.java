public class BinaryToDecimal {
    public static void main(String[] args) {

        int[] arr = {1,0,1,0,0,1,0,1,1,1,0};

        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            b = b * 2 + arr[i];

        }
        System.out.println(b);
    }
}


