package Array;

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] numbers = { 4, 3, 2, 8, 7, 6, 1 };

        FindMissingNumber fmn = new FindMissingNumber();

        System.out.println(fmn.findMissingNumber(numbers));

    }

    public int findMissingNumber(int[] numbers) {
        int result = ((numbers.length + 1) * (numbers.length + 2)) / 2;

        for (int n : numbers) {
            result = result - n;
        }

        return result;
    }

}
