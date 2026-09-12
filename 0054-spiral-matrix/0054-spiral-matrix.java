class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int cb = 0;
        int ce = matrix[0].length-1;
        int rb = 0;
        int re = matrix.length -1 ;
        List<Integer> answer = new ArrayList<>();
        while(cb <= ce && rb <= re){
            for(int i = cb ; i <= ce ; i++){
                answer.add(matrix[rb][i]);
            }
            rb++;

            for(int i = rb ; i <= re ; i++){
                answer.add(matrix[i][ce]);
            }
            ce--;
            if(rb<=re){
            for(int i = ce ; i >= cb ; i--){
            answer.add(matrix[re][i]);
            }
            re--;}
            if(cb<=ce){
            for(int i = re ; i>= rb ; i--){
                answer.add(matrix[i][cb]);
            }
            cb++;
            }
        }
        return answer;
    }
}