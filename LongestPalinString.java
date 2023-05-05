class LongestPalinString {
    public String longestPalindrome(String s) {
        String m ="";
        int longest = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
         // odd length
            int left = i-1;
            int right = i+1;
            while(left>=0 && right<n && s.charAt(left)== s.charAt(right)){
               if(right-left +1 > longest){
                   longest = right-left+1;
                   m = s.substring(left,right+1);
               }
                left--;
                right++;
            }
        // even length
            left = i;
            right = i+1;
              while(left>=0 && right<n && s.charAt(left)== s.charAt(right)){
               if(right-left +1 > longest){
                   longest = right-left+1;
                   m = s.substring(left,right+1);
               }
                left--;
                right++;
            }
        }
        return m;
    }
}