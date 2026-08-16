// Last updated: 8/16/2026, 8:07:10 AM
1class Solution {
2    public int nearestDrone(int[][] drones, int[] target) {
3        int minDistance = Integer.MAX_VALUE;
4        int answer = -1;
5        for(int i = 0;i < drones.length;i++){
6            int distance = Math.abs(drones[i][0] - target[0]) 
7                + Math.abs(drones[i][1] - target[1]);
8            if(distance <= drones[i][2]){
9                if(distance < minDistance){
10                    minDistance = distance;
11                    answer = i;
12                }
13            }
14        }
15        return answer;
16    }
17}