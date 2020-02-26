public class Task2 {

    public static void main(String[] args) {

        int[] array = new int[8];
        int sum = 0;

        for (int i = 0; i < array.length ; i++) {
            sum = (i == 0) ? (sum = 0) : (sum = sum + 3);
            array[i] = sum;
            System.out.println(array[i]);
        }

    }

}
