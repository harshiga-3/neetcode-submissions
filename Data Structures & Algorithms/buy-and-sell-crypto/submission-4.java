class Solution {
    public int maxProfit(int[] nums) {
        int min=Integer.MAX_VALUE;int max=0;
        for(int n:nums)
        {
             min=Math.min(min,n);
             int profit=n-min;
             max=Math.max(max,profit);
        }
        return max;
    }
}
