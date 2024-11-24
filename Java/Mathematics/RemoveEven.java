package Mathematics;

import Array.PrintArray;

public class RemoveEven {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int[] removedEven = removeEven(arr);
        PrintArray.print(removedEven);
    }

    private static int[] removeEven(int[] arr) {
        // Count odd numbers in the array
        int oddCount = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }

        // Create a new array for odd numbers
        int[] newArray = new int[oddCount];
        int idx = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                newArray[idx++] = num;
            }
        }
        return newArray;
    }
}
