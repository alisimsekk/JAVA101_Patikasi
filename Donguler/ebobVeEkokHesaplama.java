package Donguler;

import java.util.Scanner;

public class ebobVeEkokHesaplama {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n1, n2;
        int i = 1;
        int j=1;

        System.out.print("1. sayıyı giriniz : ");
        n1 = input.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        n2 = input.nextInt();
        
        if(n1<n2){
            i=n1;
                while(i>0){
                    if (n1%i==0 && n2%i==0){
                    System.out.println("EBOB : " +i );
                    i = 0;
                    }
                i--;
                }
        }
        else{
            i=n2;
                while(i>0){
                    if (n1%i==0 && n2%i==0){
                    System.out.println("EBOB : " +i );
                    i = 0;
                    }
                i--;
                }
        } 

        while(j<=n1*n2){
            if(j%n1==0 && j%n2==0){
                System.out.println("EKOK : " +j );
                break;
            }
            j++;    
        }
    }

}