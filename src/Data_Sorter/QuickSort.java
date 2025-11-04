package Data_Sorter;

public class QuickSort {
    private static int steps;

    public static SortResult sort(int[] arr) {
        int[] array = arr.clone();
        steps = 0;
        long start = System.nanoTime();
        quicksort(array, 0, array.length - 1);
        long end = System.nanoTime();
        return new SortResult("Quick Sort", array, end - start, steps);
    }

    private static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            steps++;
            int pi = partition(arr, low, high);
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            steps++;
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
