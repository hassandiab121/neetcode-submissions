class Solution {
    public boolean isAnagram(String s, String t) {

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
                    uniqueT.replace(ch, uniqueT.get(ch) - 1);
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
                    uniqueS.replace(ch, uniqueS.get(ch) - 1);
            }
            else
                if ( uniqueT.get(ch) == null)
                    uniqueT.put(ch,1);
                else
                    uniqueT.put(ch,uniqueT.get(ch) + 1);
        }
    return uniqueS.isEmpty();

    }
}
