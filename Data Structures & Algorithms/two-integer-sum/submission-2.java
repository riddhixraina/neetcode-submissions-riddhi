class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i=0; i < nums.length; i++){
            int comp = target - nums[i];
            if(map.containsKey(comp)){
                result[0] = map.get(comp);
                result[1] = i;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}

/*
Hashmap:
v i
4 0
5 1
6 2

target = 7

[3,4,5,6]    
 7-3 = 4 -> put 3 in hashmap  
 7-4 = 3 -> yes in the map -> so add 4 and it's index and print the key
*/