package src.solutions;

public class BuildFilteredReverseString implements Solution {
    @Override
    public boolean isPalindrome(String s) {
        char[] original = s.toCharArray();
        StringBuilder filtered = new StringBuilder();

        for( Character c : original) {
            if( Character.isDigit(c) || Character.isLetter(c)) {
                filtered.append(c);
            }
        }
        return filtered.toString().equalsIgnoreCase(filtered.reverse().toString());
    }
}
