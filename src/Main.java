import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1
        int ar[] = {2, 2, 1, 8, 3, 2, 2, 4, 2};

        Arrays.fill(ar, 10);
        System.out.println("Array completely filled" +
                " with 10\n" + Arrays.toString(ar)+"\n");


        // 2
        int ar2[] = {2, 2, 2, 2, 2, 2, 2, 2, 2};

        Arrays.fill(ar2, 1, 5, 10);
        System.out.println(Arrays.toString(ar2)+"\n");


        // 3
        int [][]ar3 = new int [3][4];

        for (int[] row : ar3)
            Arrays.fill(row, 10);
        System.out.println(Arrays.deepToString(ar3)+"\n");


        // 4
        int[][][] ar4 = new int[3][4][5];

        for (int[][] row : ar4) {
            for (int[] rowColumn : row) {
                Arrays.fill(rowColumn, -1);
            }
        }
        System.out.println(Arrays.deepToString(ar4));
    }
}