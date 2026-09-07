class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");

        String[] result = new String[words.length];
         for(String word : words){
            // last charcter se position nikalenge
            int pos = word.charAt(word.length() - 1) - '1';
            //remove krenge number ko and place krdenqge word ko uske correct position pe
            result[pos] = word.substring(0, word.length() -1);

        }
        // join kredenge words with space a dn return sorted sentence
        return String.join(" ", result);
    }
}