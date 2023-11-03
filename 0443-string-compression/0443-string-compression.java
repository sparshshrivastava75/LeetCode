class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        StringBuilder sb = new StringBuilder();
        int count = 1;
        if(n==1)return 1;
        for(int i=0;i<n;i++){
            char c = chars[i];

            while(i<n-1 && chars[i] == chars[i+1]){
                count++;
                i++;
            }
            sb.append(c);

            if(count>1){
                sb.append(count);
            }

            count = 1;
        }
        
        String str1 = sb.toString();
        char[] str2 = str1.toCharArray();

        for(int i=0;i<str2.length;i++){
            chars[i]=str2[i];
        }
        return str2.length;
    }
}