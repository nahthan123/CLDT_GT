package sortAlgorithm;

import searchAlgorithm.BinarySearch;
import searchAlgorithm.LinearSearch;
import sortAlgorithm.SelectionSort;
import sortAlgorithm.InsertionSort;
import sortAlgorithm.BubbleSort;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int arrayLength = scanner.nextInt();

        // Khởi tạo mảng
        int[] arrayInput = new int[arrayLength];

        // Nhập các phần tử của mảng từ bàn phím
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arrayInput[i] = scanner.nextInt();
        }

        // Nhập giá trị cần tìm
        System.out.print("Nhập giá trị cần tìm: ");
        int key = scanner.nextInt();

        // Gọi các phương thức tìm kiếm và sắp xếp
        callMeForLinearSearch(arrayInput, key);
        callMeForBinarySearch(arrayInput, key);
        callMeForSelectionSort(arrayInput);
        callMeForInsertionSort(arrayInput);
        callMeForBubbleSort(arrayInput);

        scanner.close();
    }

    // Tìm kiếm tuyến tính
    static void callMeForLinearSearch(int[] arrayInput, int key) {
        LinearSearch linearSearchInstance = new LinearSearch();
        int result = linearSearchInstance.linearSearch(arrayInput, key);
        if (result != -1) {
            System.out.println("Vị trí của phần tử cần tìm là: " + result);
        } else {
            System.out.println("Phần tử không có trong mảng.");
        }
    }

    // Tìm kiếm nhị phân
    static void callMeForBinarySearch(int[] arrayInput, int key) {
        BinarySearch binarySearchInstance = new BinarySearch();
        int result = binarySearchInstance.binarySearch(arrayInput, key);
        if (result != -1) {
            System.out.println("Vị trí của phần tử cần tìm là: " + result);
        } else {
            System.out.println("Phần tử không có trong mảng.");
        }
    }

    // Sắp xếp chọn
    static void callMeForSelectionSort(int[] arrayInput) {
        SelectionSort selectionSortInstance = new SelectionSort();
        System.out.println("Mảng trước khi sắp xếp:");
        printArray(arrayInput);
        selectionSortInstance.selectionSort(arrayInput);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arrayInput);
    }

    // Sắp xếp chèn
    static void callMeForInsertionSort(int[] arrayInput) {
        InsertionSort insertionSortInstance = new InsertionSort();
        System.out.println("Mảng trước khi sắp xếp:");
        printArray(arrayInput);
        insertionSortInstance.insertionSort(arrayInput);
        System.out.println("Mảng sau khi sắp xếp từ bé đến lớn:");
        printArray(arrayInput);

        // Sắp xếp từ lớn đến bé
        insertionSortInstance.insertionSort(arrayInput);
        System.out.println("Mảng sau khi sắp xếp từ lớn đến bé:");
        printArray(arrayInput);
    }

    // Sắp xếp nổi bọt
    static void callMeForBubbleSort(int[] arrayInput) {
        BubbleSort bubbleSortInstance = new BubbleSort();
        System.out.println("Mảng trước khi sắp xếp:");
        printArray(arrayInput);
        bubbleSortInstance.bubbleSortAscending(arrayInput);
        System.out.println("Mảng sau khi sắp xếp tăng dần:");
        printArray(arrayInput);

        bubbleSortInstance.bubbleSortDescending(arrayInput);
        System.out.println("Mảng sau khi sắp xếp giảm dần:");
        printArray(arrayInput);
    }

    // In mảng
    static void printArray(int[] arrayInput) {
        for (int num : arrayInput) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
