package src.solutions;

public class RegexReplaceReverse implements Solution {
    @Override
    public boolean isPalindrome(String s) {
        String filtered = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        return filtered.equals(new StringBuilder(filtered).reverse().toString());
    }
}
