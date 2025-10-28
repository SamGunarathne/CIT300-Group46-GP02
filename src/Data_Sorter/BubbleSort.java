package Data_Sorter;

public class BubbleSort {
    public static SortResult sort(int[] arr) {
        int[] array = arr.clone();
        int steps = 0;
        long start = System.nanoTime();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                steps++;
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        long end = System.nanoTime();
        return new SortResult("Bubble Sort", array, end - start, steps);
    }
}
