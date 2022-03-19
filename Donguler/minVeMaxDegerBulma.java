package Donguler;

import java.util.Scanner;

public class minVeMaxDegerBulma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int toplam=0;
        int n=0;
        int max, min;

        System.out.print("Toplam Kaç Sayı Girilecek : ");
        toplam = input.nextInt();

        System.out.print("1. sayıyı giriniz : ");
            n = input.nextInt();
            max=n;
            min=n;

        for (int i=0;i<(toplam-1);i++){
            System.out.print((i+2) + ". sayıyı giriniz : ");
            n = input.nextInt();

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