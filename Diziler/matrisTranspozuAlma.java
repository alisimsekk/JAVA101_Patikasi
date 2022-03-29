package Diziler;

public class matrisTranspozuAlma {
    public static void main(String [] args){
        int [][] matris = { {1, 2, 3}, {4, 5, 6}};
        int a=matris.length;
        int b=matris[0].length;
        int c;
        int [][] matrisT = new int [b][a];

        System.out.println("Matris : ");

        for(int i=0; i<matris.length; i++){
            for(int j=0; j<matris[i].length; j++){
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }

       for(int k=0; k<matris.length; k++){
            for(int l=0; l<matris[k].length; l++){
                c=matris[k][l];
                matrisT[l][k]=c;
            }
        }

        System.out.println("Transpoze : ");
        for(int i=0; i<matrisT.length; i++){
            for(int j=0; j<matrisT[i].length; j++){
                System.out.print(matrisT[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
