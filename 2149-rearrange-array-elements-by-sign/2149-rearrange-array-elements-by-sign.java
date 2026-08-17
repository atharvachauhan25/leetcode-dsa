class Solution {
    public int[] rearrangeArray(int[] nums) {
        int i=0,j=1;
        int[] newNums = new int[nums.length];
        for(int k=0;k<nums.length;k++){
            if(nums[k]>0){
                newNums[i]=nums[k];
                i+=2;
            } else{
                newNums[j]=nums[k];
                j+=2;
            }
        }
        return newNums;
    }
}