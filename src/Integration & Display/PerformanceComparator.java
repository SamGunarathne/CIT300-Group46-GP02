public class PerformanceComparator {
    public static void showComparison(SortResult... results) {
        System.out.println("\n--- Performance Summary ---");
        System.out.printf("%-15s %-15s %-15s%n", "Algorithm", "Time (ns)", "Steps");
        System.out.println("------------------------------------------");
        for (SortResult r : results) {
            System.out.printf("%-15s %-15d %-15d%n", r.name, r.time, r.steps);
        }
    }
}
