class Solution {
    public int kthGrammar(int n, int k) {
        int current = 0;

        int left = 0;
        int right = 0;
        
        for(int i=0; i<n-1; i++){
            int mid = left + (right - left) / 2;

            if(k <= mid){ //if the value is in the left
                right = mid;
            }
            else{ //if the value is in the right
                left = mid;
                if(current == 0){
                    return 1;
                }
                else{
                    return 0;
                }
            }
        }
        return current;
    }
}
