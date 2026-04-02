class Solution {
    public boolean isPalindrome(String s) {
        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while(leftPointer < rightPointer) {
            while(leftPointer < rightPointer && !Character.isLetterOrDigit(s.charAt(leftPointer))) {
                leftPointer += 1;
            }

            while(leftPointer < rightPointer && !Character.isLetterOrDigit(s.charAt(rightPointer))) {
                rightPointer -= 1;
            }

            if(Character.toLowerCase(s.charAt(leftPointer)) != Character.toLowerCase(s.charAt(rightPointer))) {
                return false;
            }

            leftPointer += 1;
            rightPointer -= 1;
        }

        return true;
    }
}
