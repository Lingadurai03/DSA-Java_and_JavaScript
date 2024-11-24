package Array;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 1, 2 };

        MoveZerosToEnd mzte = new MoveZerosToEnd();
        PrintArray.print(mzte.moveZeros(arr));

    }

    public int[] moveZeros(int[] arr) {
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
                idx++;

            }
        }
        return arr;
    }

}
