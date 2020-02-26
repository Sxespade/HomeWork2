public class Task5 {
    public static void main(String[] args) {
        int[] array = {2,40,32,4,76,3,0,57,-4,6};
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if(array[i] > max) max = array[i];
            if(array[i] < min) min = array[i];
        }
        System.out.println(max);
        System.out.println(min);
    }
}
