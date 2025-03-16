package basicb;

public class QuickSort {
    public static int partition(int a[], int low, int high) {
        int pivot = a[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {  // Corrected `a[i]` to `a[j]`
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp; // Fixed incorrect usage of `a[temp]`
            }
        }
        i++;
        int temp = a[i];
        a[i] = pivot;
        a[high] = temp;
        return i;
    }

    public static void quickSort(int a[], int low, int high) {
        if (low < high) {
            int pidx = partition(a, low, high); 
            quickSort(a, low, pidx - 1);
            quickSort(a, pidx + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 4, 8, 7, 5};
        int n = a.length;

        quickSort(a, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " "); // Changed `println` to `print` for single-line output
        }
        System.out.println();
    }
}
