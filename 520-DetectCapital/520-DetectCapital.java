// Last updated: 8/11/2026, 4:02:51 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        int capitalCount = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                capitalCount++;
            }
        }

        return capitalCount == word.length()
                || capitalCount == 0
                || (capitalCount == 1 && Character.isUpperCase(word.charAt(0)));
    }
}