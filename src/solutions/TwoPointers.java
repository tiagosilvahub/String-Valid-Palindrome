package src.solutions;

public class TwoPointers implements Solution {
    @Override
    public boolean isPalindrome(String s) {
        char[] c = s.toCharArray();
        int l = 0;
        int r = c.length-1;

        while(l < r) {
            if( !(Character.isDigit(c[l]) || Character.isLetter(c[l]))) {
                l++;
                continue;
            }
            if( !(Character.isDigit(c[r]) || Character.isLetter(c[r]))) {
                r--;
                continue;
            }
            if(Character.toLowerCase(c[l]) != Character.toLowerCase(c[r])) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
