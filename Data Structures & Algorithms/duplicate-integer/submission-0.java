class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set detector = new HashSet<>();
        for(int num : nums){
            if(detector.contains(num)){
                return true;
            }
            detector.add(num);
        }
         return false;
    }
}