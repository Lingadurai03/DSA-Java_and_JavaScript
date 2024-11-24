package Array;

public class FindSecondMax {

    public static void main(String[] args) {
        // Sample Arrays
        // int[] arr = { 1, 3, 4, 2, 5 }; // Second maximum: 4
        // int[] arr = { 10, 20, 30, 40, 50 }; // Second maximum: 40
        int[] arr = { 7, 2, 5, 9, 3, 10 }; // Second maximum: 9

        FindSecondMax fsm = new FindSecondMax();

        System.out.println(fsm.findSeconMax(arr));

    }

    public int findSeconMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (max < num) {
                secondMax = max;
                max = num;

            } else if (secondMax < num && max != num) {
                secondMax = num;
            }
        }
        return secondMax;
    }
}
