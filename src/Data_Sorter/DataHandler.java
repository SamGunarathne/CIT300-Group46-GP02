package Data_Sorter;

import java.util.*;

public class DataHandler {
    public static int[] manualInput(Scanner sc) {
        System.out.print("Enter numbers separated by spaces: ");
        String[] input = sc.nextLine().trim().split("\\s+");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) arr[i] = Integer.parseInt(input[i]);
        return arr;
    }

    public static int[] generateRandom(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = rand.nextInt(100);
        return arr;
    }
}
