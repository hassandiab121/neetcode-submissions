class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> unique = new HashSet();

        for (int index = 0; index < nums.length; index++)
            if (unique.contains(nums[index]))
                return true;
            else
            unique.add(nums[index]);
        return false;
        
    }
}