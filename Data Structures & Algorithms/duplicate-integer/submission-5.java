class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        // for(int i=0; i<nums.length; i++){
        //     if(!set.contains(nums[i])){ //2-hash lookups (contains and add)
        //         set.add(nums[i]);
        //     }
        //     else {
        //         return true;
        //     }
        // }
        // return false;

        //we can do with one hash look up as well
        for(int x : nums){
            if(!set.add(x)) return true;
        }
        return false;
    }
}

/*
[1,2,3,3]
set.add(x)
true - added 1 -> program returns false
true - added 2 -> program returns false
true - added 3 -> program returns false
false - 3 already there -> program returns true

[2, 2, 1, 1, 3, 1, 2, 3, 1, 4]
set = [2] false


 nums = [1, 2, 3, 3]

 Set = {1, 2, 3}

 count - > Hashmap 
 V count(key)
 1 1
 2 1
 3 2
*/