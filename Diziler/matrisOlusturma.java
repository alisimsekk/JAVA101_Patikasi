package Diziler;

import java.util.Scanner;

public class matrisOlusturma {
    public static void main(String [] args){
        int [][] matrix = new int [3][3];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length;j++){
                System.out.print(i+1 + ". satır " + (j+1) + ". sütun değerini giriniz : ");
                matrix [i][j] = input.nextInt();
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
