class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return intersection(nums2,nums1);
        }
        Set<Integer> intersections = new HashSet<>();
        for(int i:nums1){
            intersections.add(i);
        }
        int[] temp = new int[intersections.size()];
        int x=0;
        for(int i:nums2){
            if(intersections.contains(i)){
                temp[x++]=i;
                intersections.remove(i);
            }
        }
        int[] intersec = new int[x];
        System.arraycopy(temp,0,intersec,0,x);
        return intersec;
    }
}