class Solution {
   /**
    pick an element.
    check if its anagram with others or not.
    if its add the anagrams add it to the list.
   */  public  List<List<String>> groupAnagrams(String[] strs) {

    List<List<String>> group = new ArrayList(10);
    boolean added ;
    int groupIndex = 0;
    LinkedList anagramGroup = null;

        for (int indexF = 0; indexF < strs.length; indexF++ )
        {
            added = false;
            anagramGroup = new LinkedList();
            
            if (strs[indexF] != null)
                anagramGroup.add(strs[indexF]);

            for (int indexS = indexF +1; indexS < strs.length; indexS++)
            {
                    //System.out.println("check-->" + strs[indexF] +" "+ strs[indexS]);

                if (isAnagram(strs[indexF],strs[indexS]))
                {
                    anagramGroup.add(strs[indexS]);
                    added = true;
                    strs[indexS] = null;
                }
            }

            if (added)
            {
                group.add(anagramGroup);
                strs[indexF] = null;

            }
            else if (anagramGroup.size() != 0)
                group.add(anagramGroup);

        }
        return group;
    }
    private boolean isAnagram(String s1, String s2)
    {
        if (s1 == null || s2 == null || s1.length() != s2.length())
            return false;

        for (int index = 0; index < s1.length(); index++)
            if (!contain(s1, s2.charAt(index)))
                return false;
        return true;
    }

    private boolean  contain(String s, char ch)
    {
        for (int index = 0; index < s.length(); index++)
            if (s.charAt(index) == ch)
                return true;
        return false;
    } 


}
