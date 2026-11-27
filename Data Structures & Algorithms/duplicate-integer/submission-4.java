class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else {
                return true;
            }
        }
        return false;
    }
}

/*
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