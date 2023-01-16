public class TwoDimensionalArraysDifferentLengths {
    public static void main(String[] args) {
        int[][] matrix = {
                {5, 12, 44, -8, 7, 25},
                {85, -3, 9},
                {21, -7, 2, 11},
                {4, 66}
        };
        int j = 0;
        System.out.println("The longest array will be ");
        System.out.print("{");
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length > matrix[j].length) {
                j = i;
            }
        }
        for (int i = 0; i < matrix[j].length; i++) {
            System.out.print(matrix[j][i] + ",");
        }
        System.out.print("}");
    }
}
