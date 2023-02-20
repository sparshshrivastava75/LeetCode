class Majority {
    public int majorityElement(int[] nums) {
        int  n = nums.length;
        int count = 0;
        int element = 0;

        for(int i=0;i<n;i++){
            if(count == 0){
                element = nums[i];
            }
            if(nums[i] == element){
                count+=1;
            }
            else{
                count-=1;
            }
           
        }
System.out.println(element);
	
         return  element;
        
    }
public static void main(String args[]){
	Majority m=new Majority();
	int nums[]={2,2,1,1,1,2,2};
	m.majorityElement(nums);
	
	}
}

