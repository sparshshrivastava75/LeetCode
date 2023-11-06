class Solution {

    public int Isvowel(char ch){
        return(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?  1:0;

          
    }

        
    public int maxVowels(String s, int k) {
        int n = s.length();
        int l=0;
        int r=0,result=0, count=0;
        for(r=0; r < k ;r++){
            count += Isvowel(s.charAt(r));
        }
        result = count;
        while(r<n){
            count-= Isvowel(s.charAt(l++));
            count+= Isvowel(s.charAt(r++));
            result = Math.max(result,count);
            
        }

    return result;
        
    }
}