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
        if (s.length() != t.length())
            return false;

        HashMap<Character,Integer> uniqueS = new HashMap();
        HashMap<Character,Integer> uniqueT = new HashMap();

        char ch = 0;
        for (int index = 0; index < s.length(); index++)
        {
            ch = s.charAt(index);

            if (uniqueT.containsKey(ch))
            {
                if (uniqueT.get(ch) == 1)
                    uniqueT.remove(ch,1);
                else
                     {
                    System.out.print(ch);
                    uniqueT.replace(ch, uniqueT.get(ch) - 1);
                }
            }
            else
                if ( uniqueS.get(ch) == null)
                    uniqueS.put(ch,1);
                else
                    uniqueS.put(ch,uniqueS.get(ch) + 1);


             ch = t.charAt(index);

            if (uniqueS.containsKey(ch))
            {
                if (uniqueS.get(ch) == 1)
                    uniqueS.remove(ch,1);
                else
                {
                    System.out.print(ch);
                    uniqueS.replace(ch, uniqueS.get(ch) - 1);
                }
            }
            else
                if ( uniqueT.get(ch) == null)
                    uniqueT.put(ch,1);
                else
                    uniqueT.put(ch,uniqueT.get(ch) + 1);
        }
    return uniqueS.isEmpty();
    }

    private boolean  contain(String s, char ch)
    {
        for (int index = 0; index < s.length(); index++)
            if (s.charAt(index) == ch)
                return true;
        return false;
    } 


}
