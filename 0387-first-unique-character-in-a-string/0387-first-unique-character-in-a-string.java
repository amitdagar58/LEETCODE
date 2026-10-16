import java .util.*;
class Solution {
    public int firstUniqChar(String s) {
        Queue<Integer> queue = new LinkedList<>();
        int [] freq = new int[26];

        // count krelenge frerquency ko har character ki
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }

        // add krenege indices of every characted
        for(int i = 0; i< s.length(); i++){
            queue.offer(i);
        }

        //  hm find krlenge first character with frequency 1
        while(!queue.isEmpty()){
            int index = queue.poll();
            char ch = s.charAt(index);

            if(freq[ch - 'a'] == 1){
                return index;
            }

        }

        return -1;

        
    }
}