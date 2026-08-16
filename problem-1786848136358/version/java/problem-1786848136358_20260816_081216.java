// Last updated: 8/16/2026, 8:12:16 AM
1class Solution {
2    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
3        int maxlight = 0;
4        for(int light : lights){
5            maxlight = Math.max(maxlight,light);
6        }
7        int answer = 0;
8        for(int time : arrivalTime){
9            int r = time % period;
10            int wait = 0;
11            if(r >= maxlight){
12                wait = period - r;
13            }
14            answer = Math.max(answer,wait);
15        }
16        return answer;
17    }
18}