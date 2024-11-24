package Array;

public class Palindrome {

    public static void main(String[] args) {

        String word = "madam";

        Palindrome p = new Palindrome();
        System.out.println(p.checkPalindromeOrNot(word));

    }

    public boolean checkPalindromeOrNot(String word) {

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
