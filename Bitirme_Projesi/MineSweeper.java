package Bitirme_Projesi;

import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    Scanner input=new Scanner(System.in);
    String [][] emptyMap = new String [this.rowNumber][this.colNumber];
    String [][] mapWithMine = new String [this.rowNumber][this.colNumber];
    int bomb = (rowNumber*colNumber/4);

    MineSweeper(int rowNumber, int colNumber){
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.emptyMap = new String [this.rowNumber][this.colNumber];
        this.mapWithMine = new String [this.rowNumber][this.colNumber];
        this.bomb = (this.rowNumber*this.colNumber/4);
    }
    
    public void emptyMap(){
        for(int i = 0; i<emptyMap.length; i++){
            for(int j = 0; j<emptyMap[i].length; j++){
                emptyMap [i][j] = "-";
            }
        }
    }

    public void mapWithMine(){
        
        for(int i = 0; i<mapWithMine.length; i++){
            for(int j = 0; j<mapWithMine[i].length; j++){
                mapWithMine [i][j] = "-";
            }
        }
        for(int k = 0; k<bomb;k++){
            int a = (int)(Math.random()*mapWithMine.length);
            int b = (int)(Math.random()*mapWithMine[0].length);
            if((mapWithMine[a][b]).equals("-")){
                mapWithMine[a][b] = "*";
            }
            else{
                k--;
            } 
        }
    }
    public void printMap(String [][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

   public boolean isWin(){
        int count=0;
        for(int i=0; i<emptyMap.length; i++){
            for(int j=0; j<emptyMap[0].length; j++){
                if((emptyMap[i][j]).equals("-")){
                    count++;
                }
            }
        }
        if(count==bomb){
            return true;
        }
        else{
            return false;
        }
    }

    public void run(){
        //System.out.println("May??nlar??n Konumu");
        mapWithMine();
       // printMap(mapWithMine);
        System.out.println("=======================");
        System.out.println("May??n Tarlas?? Oyununa Ho??geldiniz");
        emptyMap();
        printMap(emptyMap);

        while(!isWin()){
            System.out.print("Sat??r giriniz : ");
            int m = input.nextInt();
            System.out.print("S??tun giriniz : ");
            int n = input.nextInt();

            if(m>=0 && m<mapWithMine.length && n>=0 && n<mapWithMine[0].length){
                if(mapWithMine[m][n].equals("*")){
                    emptyMap[m][n]="*";
                    printMap(emptyMap);
                    System.out.println("Game Over!!");
                    break;
                }
                else{
                    int mineNumb=0;
                    //K????E NOKTALARI ??????N MAYIN KONTROL
                    if(m==0 && n==0){
                        if(mapWithMine[m][n+1].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m+1][n+1].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m+1][n].equals("*")){
                            mineNumb++;
                        }
                        emptyMap[m][n] = String.valueOf(mineNumb);
                    }

                    if(m==0 && n==mapWithMine[0].length-1){
                        if(mapWithMine[m][n-1].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m+1][n-1].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m+1][n].equals("*")){
                            mineNumb++;
                        }
                        emptyMap[m][n] = String.valueOf(mineNumb);
                    } 
                    if(m==mapWithMine.length-1 && n==mapWithMine[0].length-1){
                        if(mapWithMine[m-1][n].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m-1][n-1].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m][n-1].equals("*")){
                            mineNumb++;
                        }
                        emptyMap[m][n] = String.valueOf(mineNumb);
                    } 
                    if(m==mapWithMine.length-1 && n==0){
                        if(mapWithMine[m-1][n].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m-1][n+1].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m][n+1].equals("*")){
                            mineNumb++;
                        }
                        emptyMap[m][n] = String.valueOf(mineNumb);
                        mineNumb=0;
                    } 

                    // K????ELER HAR???? KENARLAR ??????N MAYIN KONTROL
                    if(m==0 && n>0 && n<mapWithMine[0].length-1){
                        if(mapWithMine[m][n-1].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m+1][n-1].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m+1][n].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m+1][n+1].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m][n+1].equals("*")){
                            mineNumb++;
                        }
                        emptyMap[m][n] = String.valueOf(mineNumb);
                        mineNumb=0;
                    }
                    if(m==mapWithMine.length-1 && n>0 && n<mapWithMine[0].length-1){
                        if(mapWithMine[m][n-1].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m-1][n-1].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m-1][n].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m-1][n+1].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m][n+1].equals("*")){
                            mineNumb++;
                        }
                        emptyMap[m][n] = String.valueOf(mineNumb);
                        mineNumb=0;
                    } 

                    if(m>0 && m<mapWithMine.length-1 && n==0){
                        if(mapWithMine[m-1][n].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m-1][n+1].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m][n+1].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m+1][n+1].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m+1][n].equals("*")){
                            mineNumb++;
                        }

                        emptyMap[m][n] = String.valueOf(mineNumb);
                        mineNumb=0;
                    }
                    if(m>0 && m<mapWithMine.length-1 && n==mapWithMine[0].length-1){
                        if(mapWithMine[m-1][n].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m-1][n-1].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m][n-1].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m+1][n-1].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m+1][n].equals("*")){
                            mineNumb++;
                        }

                        emptyMap[m][n] = String.valueOf(mineNumb);
                        mineNumb=0;
                    }

                    //???? KISIMLAR ??????N MAYIN KONTROL
                    if(m>0 && m<mapWithMine.length-1 && n>0 && n<mapWithMine[0].length-1){
                        if(mapWithMine[m-1][n-1].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m][n-1].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m+1][n-1].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m+1][n].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m+1][n+1].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m][n+1].equals("*")){
                            mineNumb++;
                        }
                        if(mapWithMine[m-1][n+1].equals("*")){
                            mineNumb++;
                        }
                        emptyMap[m][n] = String.valueOf(mineNumb);
                        mineNumb=0;
                    }
                }
                if(isWin()){
                    System.out.println("Oyunu Kazand??n??z !");
                }
            }
            else{
                System.out.println("S??n??rlar??n d??????nda rakam girdiniz. Tekrar giri?? yap??n.");
            }
            printMap(emptyMap);
            isWin();
            System.out.println("=======================");
        }
    }
} // www.patika.dev
