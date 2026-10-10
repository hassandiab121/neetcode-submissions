class Solution {
// we need more optemization regarding memory

    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> frequency = new HashMap();
        ArrayList<Integer>[] f = new ArrayList[nums.length +1];
        int[] kElements = new int[k];
 
        int max = 0;

        for (int index = 0; index < nums.length; index++){
            if (frequency.containsKey(nums[index]))
                    frequency.replace(nums[index],          frequency.get(nums[index]) +1);
            else 
                 frequency.put(nums[index],1);


        }


        frequency.forEach((element,freq) -> {
            if (f[freq] == null )
            {
            f[freq] = new ArrayList();
            f[freq].add(element);
            }
            else
                f[freq].add(element);

        
        });

        for (int index = f.length -1; index >= 0 && k >= 0; index--)
        {
            if (k != 0 && f[index] != null)
            for (int element : f[index])
            {
                if (k == 0)
                    break;
                kElements[--k] = element;

            }
        }
        
        return kElements;
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
