class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();
        if(s.length() != t.length()) return false;
        
        for(char c : s.toCharArray()){
            // if(!smap.containsKey(c)){
            //     smap.put(c, 1);  
            // }
            // else{
            //     smap.put(c, smap.get(c) + 1);
            // }
            
            smap.put(c, smap.getOrDefault(c, 0) + 1);
        }

        for(char ch : t.toCharArray()){
            tmap.put(ch, tmap.getOrDefault(ch, 0) + 1);
        }

        if(smap.equals(tmap)){
            return true;
        }
        return false;
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
*/