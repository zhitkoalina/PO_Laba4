import java.util.Arrays;
import java.util.Scanner;

public class ConsoleApp {
    public static void main(String[] args) {
        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("\n\n\nВведите количество элементов массива: ");
            int size = input.nextInt();
            int array[] = new int[size];
            System.out.println("\nВведите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();
            }

            System.out.println("\n\n\nИсходный массив:\n" + Arrays.toString(array));

            MergeSort.mergeSort(array, array.length);
            System.out.println("\nОтсортированный массив:\n" + Arrays.toString(array));
        }
    }
}
