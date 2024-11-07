package searchAlgorithm;

public class BinarySearch {
    // Phương thức tìm kiếm nhị phân theo kiểu lặp
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Kiểm tra nếu phần tử ở giữa là mục tiêu
            if (arr[mid] == target) {
                return mid;
            }

            // Nếu target lớn hơn, bỏ qua nửa trái
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // Nếu target nhỏ hơn, bỏ qua nửa phải
            else {
                right = mid - 1;
            }
        }

        // Trả về -1 nếu không tìm thấy
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int target = 4;
        int result = binarySearch(arr, target);
        System.out.println("Index of target: " + result);
    }
}
