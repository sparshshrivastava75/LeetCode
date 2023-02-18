class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] temp = new int[m+n];
        int p=m+n;
      //  int[] temp=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                temp[k]=nums1[i];                                                                                      
                i++;
            }else{
                temp[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1.length){
            temp[k]=nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length){
            temp[k]=nums2[j];
            j++;
            k++;
        }
        if(p%2==0){ 
        return ((double)(temp[p/2-1]+temp[p/2])/2);
        }
        else{ 
        return (temp[p/2]);
        }
    }
}