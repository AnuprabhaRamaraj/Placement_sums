class Missingpositive {
    public int removeElement(int[] nums, int val) {
int count=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==val){
            count++;
        }
    }
    
    int index=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=val){
            nums[index]=nums[i];
            index++;
        }
    }
        for (int i= 0;i<index;i++) {
	            System.out.print(nums[i]);
	        } 
    return index;
    }
}