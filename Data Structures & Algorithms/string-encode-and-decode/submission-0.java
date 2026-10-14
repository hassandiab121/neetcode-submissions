class Solution {

 public String encode(List<String> strs) {
        StringBuilder st = new StringBuilder();
        int decode;
        for (String word : strs){
            for (int index = 0; index < word.length(); index++){
                decode = word.charAt(index);
                st.append(decode);
                st.append(",");  
            }
            st.append("%");
        }

        return st.toString();

    }

    public List<String> decode(String str) {
        List<String> list = new LinkedList();
        StringBuilder character = new StringBuilder();
        StringBuilder word = new StringBuilder();
        int asci ;

        for (int index = 0; index < str.length(); index++){
            
            

            if (str.charAt(index) == ',')
            {
                
                asci = Integer.parseInt(character.toString());
                word.append((char) asci);
                character = new StringBuilder();
                continue;
            }

            if (str.charAt(index) == '%')
            {
                list.add(word.toString());
                word = new StringBuilder();
                character = new StringBuilder(); 
                continue;
            }
            
            character.append(str.charAt(index));


        }

        return list;

    }
    
}
