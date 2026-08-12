class Solution {
    public int missingNumber(int[] nums) {
        Map<Integer,Integer> numbers = new HashMap<>();
        int n = nums.length;
        for(int i:nums){
            numbers.put(i,1);
        }
        for(int i=0;i<=n;i++){
            if(numbers.get(i)==null)
            return i;
        }
        return -1;
    }
}