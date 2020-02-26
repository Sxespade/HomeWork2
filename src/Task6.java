public class Task6 {
    public static void main(String[] args) {

        int[] array1 = {2, 2, 2, 1, 2, 2, 10, 1};
        Boolean b = method(array1);
        System.out.println(b);

        int[] array2 = {1, 1, 1, 2, 1};
        Boolean c = method(array2);
        System.out.println(c);

        int[] array3 = {1, 1, 3, 3, 2, 1};
        Boolean d = method(array3);
        System.out.println(d);

    }

    private static Boolean method(int[] array) {
        int sum1 = 0;
        int sum2 = 0;

        int i = 0;
        sum1 = sum1 + array[i];

        int j = array.length - 1;
        sum2 = sum2 + array[j];

        while (i < j - 1) {
            if (sum1 >= sum2) {
                sum2 = sum2 + array[j - 1];
                --j;
            } else if (sum1 < sum2) {
                sum1 = sum1 + array[i + 1];
                ++i;
            }
        }

        System.out.println(sum1 + "  " + sum2);

        return sum1 == sum2;
    }
}
