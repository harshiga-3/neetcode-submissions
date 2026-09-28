class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer>s=new HashSet<>();
       for(int n:nums){
        s.add(n);
       }
       int max=0;int c=1;
       for(int n:s)
       {
        if(!s.contains(n-1))
        {
            int val=n;
             c=1;
            while(s.contains(val+1))
            {
                c++;
                val++;
            }
        
        max=Math.max(c,max);
        }
       }
       return max;
        
    }
}
