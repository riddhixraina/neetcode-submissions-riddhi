class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char s = board[i][j];
                
                if(s != '.'){
                if(!set.add(s + "r" + i) || !set.add(s + "c" + j) || !set.add(s + "b" + i/3 + j/3)){
                    return false;
                }
                }
                
            }
        }
        return true;
    }
    
}
