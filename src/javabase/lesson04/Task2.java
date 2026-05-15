package javabase.lesson04;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 3, -2, 88, 0, -1, 9, 10, 11, 41};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        int average = sum/array.length;
        System.out.println(sum);


    }
}
