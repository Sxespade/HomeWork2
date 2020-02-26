public class Task4 {

    public static void main(String[] args) {

        final int SIZE = 5;

        int[][] array = new int[SIZE][SIZE];



        for (int i = 0; i < SIZE ; i++) {
            for (int j = 0; j < SIZE; j++) {
                array[i][j] = (i == j) ? (array[i][j] = 1) : (array[i][j] = 0);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
