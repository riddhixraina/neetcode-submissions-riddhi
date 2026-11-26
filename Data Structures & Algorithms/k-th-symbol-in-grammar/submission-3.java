class Solution {
    public int kthGrammar(int n, int k) {

    //Recursion:
    /*
   1 0
   2 0 1
   3 0 1 1 0
   4 0 1 1 0 1 0 0 1
     1 2 3 4 5 6 7 8
   1. we know that the k = 1 and k = 2 positions come from left parent
    k = 3 k = 4 postions come from the right parent
    0
    0 1

    1
    1 0
   Right parent:
    even: k value, n = 4, k = 6 (comes from n = 3, k = 3 -> n = 2, k = 2 -> n = 1, k = 1)
    odd: k value,  n = 4, k = 5 (comes from n = 3, k = 3 -> n = 2, k = 2 -> n = 1, k = 1)
   Left Parent:
    even: k value, n = 4, k = 4 (comes from n = 3, k = 2 -> n = 2, k = 1 -> n = 1, k = 1)
    odd: k value, n = 4, k = 1 (comes from n = 3, k = 1 -> n = 2, k = 1 -> n = 1, k = 1)
    (n-1)(k+1/2)

    k value is odd then the position of the left child stays the same
    k value is even then the position of the right flips
    */
    if(n==1) return 0;
    int parent = kthGrammar(n-1, (k+1)/2);
    return (k % 2 == 0) ? 1 - parent : parent;
    //two pointer with binary search:    

    //     int left = 1;
    //     int right = (int)Math.pow(2^(n-1));
    //       boolean current = false;
        
    //     while(left < right){
    //         int mid = left + (right - left) / 2;

    //         if(k <= mid){ //if the value is in the left
    //             right = mid;
    //         }
    //         else{ //if the value is in the right
    //              flag = !flag;
    //             left = mid + 1;
    //         }
    //     }
    //     return flag ? 1 : 0;

    //bruteforce solution
    /*
    0 -> 1
    0 1 -> 2 
    0 1 1 0 -> 3
    1 2 3 4 -> 2^n-1
    */
    // String[] arr = new String[n+1];
    // arr[1] = "0";
    // for(int i = 2; i <= n; i++){
    //     StringBuilder current = new StringBuilder();
    //     String prev = arr[i - 1];
    //     for(int j = 0; j < prev.length(); j++){
    //         if(prev.charAt(j) == '0'){
    //             current.append("01");
    //         }
    //         else{
    //             current.append("10");
    //         }
    //     }
    //     arr[i] = current.toString();
    // }
    // return arr[n].charAt(k-1) - '0';
    }
}
