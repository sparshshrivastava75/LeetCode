class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int result=0;
        //int max = 0;
        for(int j=0;j<k;j++){
            sum += nums[j];
        }
        int max = sum;
        for(int i=k;i<n;i++){
            sum += nums[i] - nums[i-k];
            max = Math.max(max,sum);
        }
       return (double)max/k; 
    }
}