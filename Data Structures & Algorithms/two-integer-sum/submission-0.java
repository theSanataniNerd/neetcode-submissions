class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> lookup = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];

            if (lookup.containsKey(value)) {
                return new int[]{lookup.get(value), i};
            }

            lookup.put(nums[i], i);
        }

        return new int[]{};
    }
}
