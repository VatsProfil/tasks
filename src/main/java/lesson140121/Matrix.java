package lesson140121;

public class Matrix {

    public static void main(String[] args) {

        returnMatrix(10);
    }

    public static void returnMatrix(int n){

        int [][]massiv = new int[n][n];
        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(massiv[i][j] + " ");
            }

            System.out.println();
        }
    }

}
