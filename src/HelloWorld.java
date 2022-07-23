import java.util.Arrays;


public class HelloWorld {
    public static void main(String[] args) {
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10);
        }

        int [] array2 = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        int [] array3 = new int [99];
        int a = 2;
        for (int i = 0; i < array3.length; i++) {
            array3[i] = a++;
        }

        for (int i = 0; i < array3.length; i++) {

        }
        System.out.println(Arrays.toString(array3));


        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array));




/*        Arrays.sort(array);
        double summa = (double)(Arrays.stream(array).sum());
        System.out.println(Arrays.toString(array));
        System.out.println("Минимальное значение равно " + array[0]);
        System.out.println("Максимальное значение равно " + array[array.length-1]);
        System.out.println("Среднее значение равно " + Math.round(summa/(array.length + 1)));*/

    }
}
