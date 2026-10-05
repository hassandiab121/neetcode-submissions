class Solution {
    /*
      I will use HashMap to solve this problem as following : 
      pick the first element and subtract it from the targer.
      the result will represent the value of another operand that    should be presented in the array.
      add this value as key to HashMap and assign it the value 1.
      pick the second element and chek if it is found in hashmap
      or not.
      if its found that mean there are two sum on our array.
      if its not do the previous operations.

      to maintain the smallest index store the first element
      index and compare it with the first element index
      of another two sum.  
    */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        int[] indices = {Integer.MAX_VALUE,1};
        int secondOperand = 0;
        for (int index = 0; index < nums.length; index++)
        {
            secondOperand = target -  nums[index];
            if (hashMap.containsKey(nums[index])){
                if (hashMap.containsKey(secondOperand) && (indices[0] >= hashMap.get(nums[index])))
                {
                    indices[0] = hashMap.get(nums[index]) - 1;
                    indices[1] = index;
                }
            }
            else
                {
                    hashMap.put(nums[index], index + 1);
                    hashMap.put(secondOperand, index + 1);

                }
            
        }
      return indices;  
    }
}
