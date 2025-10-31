import java.util.*;

public class Main {
    private static int[] dataset;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Data Sorter: Sorting Algorithm Comparison Tool ---");
            System.out.println("1. Enter numbers manually");
            System.out.println("2. Generate random numbers");
            System.out.println("3. Perform Bubble Sort");
            System.out.println("4. Perform Merge Sort");
            System.out.println("5. Perform Quick Sort");
            System.out.println("6. Compare all algorithms");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> dataset = DataHandler.manualInput(sc);
                case 2 -> {
                    System.out.print("Enter dataset size: ");
                    dataset = DataHandler.generateRandom(Integer.parseInt(sc.nextLine()));
                    System.out.println("Random dataset generated.");
                }
                case 3 -> displayResult(BubbleSort.sort(dataset));
                case 4 -> displayResult(MergeSort.sort(dataset));
                case 5 -> displayResult(QuickSort.sort(dataset));
                case 6 -> {
                    SortResult b = BubbleSort.sort(dataset);
                    SortResult m = MergeSort.sort(dataset);
                    SortResult q = QuickSort.sort(dataset);
                    PerformanceComparator.showComparison(b, m, q);
                }
                case 7 -> System.out.println("Exiting... Goodbye!");
                default -> System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 7);

        sc.close();
    }

    private static void displayResult(SortResult result) {
        System.out.println(result.name + " result: " + Arrays.toString(result.sortedArray));
        System.out.println("Time: " + result.time + " ns | Steps: " + result.steps);
    }
}
