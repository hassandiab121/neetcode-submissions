class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> frequency = new HashMap();
        ArrayList<Integer> topKFElements = new ArrayList<Integer>();

        for (int index = 0; index < nums.length; index++){
            if (frequency.containsKey(nums[index]))
            {
                       
                if (frequency.get(nums[index]) == k -1)
                {
                    topKFElements.add(nums[index]);
                    frequency.replace(nums[index],          frequency.get(nums[index]) +1);
             
                }
                
            }

            else 
            {
                frequency.put(nums[index], 1);
                if (k == 1)
                 topKFElements.add(nums[index]);

            }

        }
        return copy(topKFElements.toArray());
    }

    private int[] copy(Object[] arr)
    {
        int[] x = new int[arr.length];
        for (int index = 0; index < arr.length; index++)
        {
            x[index] = (Integer) arr[index];
        }

        return x;
    }
}
