// Last updated: 8/11/2026, 4:02:15 PM
class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int [] arr =new int[temp.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<temp.length;i++){
            while(!stack.isEmpty() && temp[stack.peek()]< temp[i])
                arr[stack.peek()]=i-stack.pop();
            
            stack.push(i);
        }
        return arr;
    }
}