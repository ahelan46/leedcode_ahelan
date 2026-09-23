// Last updated: 9/23/2026, 9:30:27 AM
1class Solution {
2    public int countWords(String[] words1, String[] words2) {
3        Map<String, Integer> map = new HashMap<>();
4        
5        for (String word : words1) {
6            map.put(word, map.getOrDefault(word, 0) + 1);
7        }
8        
9        for (String word : words2) {
10            if (map.containsKey(word) && map.get(word) <= 1) {
11                map.put(word, map.get(word) - 1);
12            }
13        }
14        
15        int count = 0;
16        for (int value : map.values()) {
17            if (value == 0) {
18                count++;
19            }
20        }
21        
22        return count;
23    }
24}