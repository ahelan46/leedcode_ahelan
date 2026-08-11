// Last updated: 8/11/2026, 3:59:20 PM
class Solution {
    public int smallestEvenMultiple(int n) {
        return n<<(n&1);
    }
}