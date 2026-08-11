// Last updated: 8/11/2026, 4:02:00 PM
class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] answer = new int[n];

        int prev = -n;

        // Left to Right
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            answer[i] = i - prev;
        }

        prev = 2 * n;

        // Right to Left
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            answer[i] = Math.min(answer[i], prev - i);
        }

        return answer;
    }
}