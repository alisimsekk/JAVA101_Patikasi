package Diziler;

public class matrixRandomDegerAtama {
    public static void main(String [] args){
        int [][] matrix = new int [5][4];

        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length;j++){
                matrix [i][j] = (int) (Math.random()*100);
            }
        }
        for(int i=0 ; i<matrix.length ;i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }
}
