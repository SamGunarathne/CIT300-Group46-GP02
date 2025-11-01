public class SortResult {
    String name;
    int[] sortedArray;
    long time;
    int steps;

    public SortResult(String name, int[] sortedArray, long time, int steps) {
        this.name = name;
        this.sortedArray = sortedArray;
        this.time = time;
        this.steps = steps;
    }
}
