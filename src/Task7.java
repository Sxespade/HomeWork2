public class Task7 {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        int n1 = -3;
        int n2 = 3;
        method(array, n1);
        System.out.println();
        method(array, n2);
    }

    private static void method(int[] array, int n) {
        int size = array.length;
        if (n > 0){
            for (int i = 0; i < n ; i++) { // совершить цикл 3 раза n раз
                int buffer = array[size - 1]; // сохраняем последний элемент
                for (int j = size-1; j > 0  ; j--) {
                    array[j] = array[j-1];  // поочередно сдвигаем каждый элемент вправо
                }
                array[0] = buffer; // присваеваем выпавший элемент
            }} else {
            n = n * (-1);
            for (int i = size; i > n; i--) {
                int buffer = array[size - 1];
                for (int j = size - 1; j > 0 ; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = buffer;
            }}

        for (var k : array) {
            System.out.print(k);
        }
    }
}



