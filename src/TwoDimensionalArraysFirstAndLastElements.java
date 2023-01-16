public class TwoDimensionalArraysFirstAndLastElements {
    public static void main(String[] args) {
        int[][] matrix = {
                {8, 77, 5, -78},
                {-2, 3, 8, 4},
                {-89, 9, -3, 85}
        };

        System.out.println("The first and last elements of each array member of a two-dimensional array will be");

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {
                System.out.println(matrix[i][0] +"," +matrix[i][matrix.length] );
                break;
            }
        }
    }
}
