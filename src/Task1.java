public class Task1 {

    public static void main(String[] args) {

        int[] array = new int[10];

        //Задаем массив с рандомными элементами 1 и 0
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ((1) + 1));
            System.out.print(array[i]);
        }

        System.out.println();

        for (int i = 0; i < array.length; i++)
            { array[i] = (array[i] == 0) ? (array[i] = 1) : (array[i] = 0);
                System.out.print(array[i]);}
        }
    }
