class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] quantity = new double[101][101];
        quantity[0][0] = poured;
        
        for(int i=0; i<query_row; i++){
            for(int j=0; j<=query_glass; j++){
                double extra = Math.max(quantity[i][j]-1.0, 0.0);
                quantity[i+1][j] += extra/2.0;
                quantity[i+1][j+1] += extra/2.0;
            }
        }
        return Math.min(quantity[query_row][query_glass], 1.0);
    }
}
