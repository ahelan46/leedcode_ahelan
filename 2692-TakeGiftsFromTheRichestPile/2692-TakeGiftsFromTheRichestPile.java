// Last updated: 8/11/2026, 3:59:03 PM
class Solution {
    public long pickGifts(int[] gifts, int k) {
        
        PriorityQueue<Integer>maxheap=new PriorityQueue<>((a,b)->(b-a));
        for(int gift:gifts){
            maxheap.add(gift);
        }
        while(k-- >0){
          maxheap.add((int)Math.floor(Math.sqrt(maxheap.poll())));

        }
        long ans=0;
        while(maxheap.size()>0)
        {
            ans=ans+maxheap.poll();

        }
        return ans;
        
        
    
    }
}