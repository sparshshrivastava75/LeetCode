class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int max=0;
        while(left<right){
            int b = right-left;
            int h = Math.min(height[left],height[right]);
            int area = h*b;
            max = Math.max(max,area);
            if(height[left] < height[right]){
                left++;
            }
            else if(height[left]>height[right]){
                right--;
            }
            else{
                left++;
                right--;
            }

        }
        return max;
    }
}