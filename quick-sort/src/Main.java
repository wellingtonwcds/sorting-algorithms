import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] items = {8,2,4,7,1,3,9,6,5};

        Arrays.stream(items).forEach((i) -> System.out.print(i + " - "));
        quickSort.sort(items, 0, items.length - 1);
        System.out.println();
        Arrays.stream(items).forEach((i) -> System.out.print(i + " - "));

    }
}