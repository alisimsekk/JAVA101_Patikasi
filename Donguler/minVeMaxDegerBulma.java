package Donguler;

import java.util.Scanner;

public class minVeMaxDegerBulma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int toplam=0;
        int n=0;
        int max=0, min=0;

        System.out.print("Toplam Kaç Sayı Girilecek : ");
        toplam = input.nextInt();        

        for (int i=0;i<toplam;i++){
            System.out.print((i+1) + ". sayıyı giriniz : ");
            n = input.nextInt();
            if(i==0){
                max=n;
                min=n;
            }           
            if(n>max){
                max=n;
            }

            if(n<min){
                min=n;
            }
        }
        System.out.println("En küçük : " + min + "\nEn büyük : " + max);
    }
    
}