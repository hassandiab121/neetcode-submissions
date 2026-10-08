class Solution {
   /**
    pick an element.
    check if its anagram with others or not.
    if its add the anagrams add it to the list.
   */  public  List<List<String>> groupAnagrams(String[] strs) {

    HashMap<Integer,List<String>> groups = new HashMap();
    List<List<String>> userData = new LinkedList();
    boolean added ;
    int groupIndex = 0;
    LinkedList<String> anagramGroup = null;
    char[] chars;

        for (int indexF = 0; indexF < strs.length; indexF++ )
        {
            
            chars = strs[indexF].toCharArray();
            Arrays.sort(chars);
           if (groups.containsKey(Arrays.hashCode(chars)))
           {
             groups.get(Arrays.hashCode(chars)).add(strs[indexF]);
           }
           else
           {
            anagramGroup = new LinkedList();
            anagramGroup.add(strs[indexF]);
            groups.put(Arrays.hashCode(chars), anagramGroup);
           }

        }

        
        return return new ArrayList(map.values());
    }
    

}
