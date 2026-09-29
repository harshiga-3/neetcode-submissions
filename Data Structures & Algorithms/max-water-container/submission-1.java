class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;

        int max=0;
        while(left<right){
            int w=right-left;
            int h=Math.min(heights[left],heights[right]);
            int a=h*w;
            max=Math.max(max,a);
            if(left<right && heights[left]<heights[right])
            {
                left++;
            }
            else 
            {
                right--;
            }
        }
        return max;
    }
}
