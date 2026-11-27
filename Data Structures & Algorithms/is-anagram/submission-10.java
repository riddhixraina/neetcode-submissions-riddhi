class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] count = new int[26];

        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int c : count){
            if(c != 0) return false;
        }
        return true;
        // Map<Character, Integer> smap = new HashMap<>();
        // Map<Character, Integer> tmap = new HashMap<>();
        // if(s.length() != t.length()) return false;
        
        // for(char c : s.toCharArray()){
        //     // if(!smap.containsKey(c)){
        //     //     smap.put(c, 1);  
        //     // }
        //     // else{
        //     //     smap.put(c, smap.get(c) + 1);
        //     // }
            
        //     smap.put(c, smap.getOrDefault(c, 0) + 1);
        // }

        // for(char ch : t.toCharArray()){
        //     tmap.put(ch, tmap.getOrDefault(ch, 0) + 1);
        // }

        // if(smap.equals(tmap)){
        //     return true;
        // }
        // return false;
    }
}

/*
s = "racecar"
t = "carrace"

smap 
Value Count
r     2
a     2
c.    2
e.    1

tmap 
Value Count
r     2
a     2
c.    2
e.    1

Another way: 
//we already know that the string is going to be lower charater letter
//count box -> [0, 0 , 0, 0, 0, 0...,0]
//letter ->    [a, b, c, d, ........ z]

//we iterate through the first s String - we increment the count for the letters present in that string in the box
// count of the t letters present in the t string - and we decrement it in the box
//finally the count of all the letters should be 0, if it's not then we have a mismatch 
*/

