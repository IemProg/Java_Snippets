import java.util.Arrays;

public class Square_Matrix {
    int [][] square;

    public Square_Matrix(int n){
        final int N = n * n;
        square = new int[n][n];

        int j = n /2, i = j + 1;
        square[i][j] = 1;

        for (int k = 2; j <= N; k++){
            if (++i == n) {
                i = 0;
            }
            if (++j == n) {
                j = 0;
            }

            while(square[i][j] != 0){
                if (++i == n){
                    i = 0;
                }
                if (--j < 0){
                    j = n-1;
                }
            }
            square[i][j] = k;
        }
    }

    @Override
    public String toString() {
        String s = " ";
        for (int i = 0; i < square.length; i++){
            for (int j = 0; j < square.length; j++){
                s += square[i][j] + " ";
                s += '\n';
            }
        }
        return s;
    }
}
