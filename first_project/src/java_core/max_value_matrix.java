package java_core;

public class max_value_matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,3}};
        int maxValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (maxValue<matrix[i][j])
                    maxValue = matrix[i][j];
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Max value in matrix : "+maxValue);
        System.out.println("\n\n\n--------End Code--------");
    }
}
