package Array;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        ReverseAnArray ra = new ReverseAnArray();

        int[] reversedArr = ra.reverseArr(arr, 0, arr.length - 1);
        PrintArray.print(reversedArr);

    }

    public int[] reverseArr(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;

    }
}
