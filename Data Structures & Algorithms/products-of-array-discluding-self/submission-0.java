class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                product = product * nums[i];
            }
            else{
                zeroCount++;
            }
            
        }

        if(zeroCount > 1){
            return new int[nums.length];
        }

        for(int j = 0; j < nums.length; j++){
            if(zeroCount > 0){
                result[j] = (nums[j] == 0) ? product : 0;
            }
            else{
                result[j] = product / nums[j];
            }
        }

        return result;
    }
}  
