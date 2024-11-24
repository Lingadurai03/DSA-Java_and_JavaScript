package Array;

public class FindMinValue {
    public static void main(String[] args) {
        int[] values = { 3, 2, 6, 2, -9, 1, 0 };
        FindMinValue fmv = new FindMinValue();
        System.out.println(fmv.findMin(values));

    }

    private int findMin(int[] arr) {
        int minValue = arr[0];
        for (int value : arr) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;

    }

}
