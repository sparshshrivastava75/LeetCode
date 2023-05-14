class SeniorCitizen {
    public int countSeniors(String[] details) {
        int count=0;
        int n = details.length;
        for(String s:details){
            int age = ((s.charAt(n-3)-'0')*10)+s.charAt(n-2)-'0';
            if(age>60) {
            count++;
        }
    }
     return count;
    }
}
