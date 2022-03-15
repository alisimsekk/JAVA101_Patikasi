package Donguler;
import java.util.Scanner;
public class ucVeDorteBolunme {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int x, toplam=0, sayac=0;

        System.out.print("Lütfen bir sayı giriniz : ");
        x = input.nextInt();

        while(0<x){

            if(x%3==0 && x%4==0){
                toplam+=x;
                sayac+=1;
            }
        
            x-=1;
        }

        int ort = toplam/sayac;
        System.out.println("3 ve 4 e bölünen sayıların ortalaması = " + ort);
    }
    
}
