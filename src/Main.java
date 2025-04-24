class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        long reversed = 0L;
        long temp = x;

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return (reversed == x);
    }

    public static class Main {
        public static void main(String[] args) {

            Palindrome solution = new Palindrome();
            System.out.println(solution.isPalindrome(121));
            System.out.println(solution.isPalindrome(-121));

        }
    }
}