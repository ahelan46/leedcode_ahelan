// Last updated: 9/11/2026, 11:50:29 AM
1class Solution {
2    public int deleteAndEarn(int[] nums) {
3      var numToCount = new HashMap<Integer, Integer>();
4	var min = Integer.MAX_VALUE;
5	var max = Integer.MIN_VALUE;
6	for (var num : nums) {
7		numToCount.compute(num, (k, v) -> v == null ? 1 : ++v);
8		min = Math.min(min, num);
9		max = Math.max(max, num);
10	}
11
12	var prevIncEarn = 0;
13	var prevExcEarn = 0;
14	for (var i = min; i <= max; i++) {
15		var incEarn = prevExcEarn + i * numToCount.getOrDefault(i, 0);
16		var excEarn = Math.max(prevIncEarn, prevExcEarn);
17		prevIncEarn = incEarn;
18		prevExcEarn = excEarn;
19	}
20	return Math.max(prevIncEarn, prevExcEarn);  
21    }
22}