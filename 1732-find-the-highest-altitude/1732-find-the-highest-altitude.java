class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int result = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum +=gain[i];
            result = Math.max(sum,result);

        }
        return result;

    }
}