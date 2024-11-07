package sortAlgorithm;

public class BubbleSort {
    // Hàm sắp xếp tăng dần
    public static void bubbleSortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    // Hàm sắp xếp giảm dần
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    // Hàm hoán đổi hai phần tử
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

        System.out.println("Mảng sắp xếp tăng dần: ");
        bubbleSortAscending(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nMảng sắp xếp giảm dần: ");
        bubbleSortDescending(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
