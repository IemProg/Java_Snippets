public class Symetric_Matrix {
    //Check if the matrix is symetric

    public boolean symetric(int matrice[][]){
        int l = 0;

        do{
            l++;
            int c = 0;
            do{
                if (matrice[l][c] != matrice[c][l]){
                    return false;
                }
                c++;
            }while (c < l);
        }while ( l < matrice.length-1);

        return true;
    }
}
