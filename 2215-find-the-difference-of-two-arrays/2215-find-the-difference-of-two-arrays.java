class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for(int i:nums1){
            s1.add(i);
        }
        for(int i:nums2){
            s2.add(i);
        }
      
        List<Integer> list1 = new ArrayList<>();

        for(int i:s1){
            if(!s2.contains(i)){
                list1.add(i);
            }
        }

        result.add(list1);

        List<Integer> list2 = new ArrayList<>();
        for(int j:s2){
            if(!s1.contains(j)){
                list2.add(j);
            }
        }
        result.add(list2);
        return result;
        
    }
}