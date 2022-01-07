/** Fill the lower-left triangle of S with elements of LL and the
  * upper-right triangle of S with elements of UR (from left-to
  * right, top-to-bottom in each case). Assumes that S is square and
  * LL and UR have at least sufficient elements. */


public class fillGrid {
    static int[] LL = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0 };
    static int[] UR = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    static int[][] S = {
            { 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0},
            { 0, 0, 0, 0, 0}
    };
    public static void main(String[] args){
        System.out.println(fillGrid(LL,UR,S));
    }
    public static int[][] fillGrid(int[] LL, int[] UR, int[][] S) {
        int N = S.length;
        int kL, kR;
        kL = kR = 0;
        for (int i = 0; i < N; i += 1) {
            for (int j = 0; j < N; j += 1) {
                if (i < j) {
                    S[i][j] = UR[kR];
                    kR += 1;
                } else if (i > j) {
                    S[i][j] = LL[kL];
                    kL += 1;
                }
            }
        }
        return(S);
    }
}