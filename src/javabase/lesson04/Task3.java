package javabase.lesson04;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 3, -2, 88, 0, -1, 9, 10, 11, 41};

        int min = Integer.MAX_VALUE;


        for (int i = 0; i < array.length; i++) {
            int instance = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];

                    int temp = array[i];
                    array[i] = min;
                    array[j] = temp;

                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i != array.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }
    }

}
