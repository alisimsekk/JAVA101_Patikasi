package Kosullu_Ifadeler;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class sicakligaGoreEtkinlik {
    public static void main(String[] args){
        int sicaklik;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Hava sıcaklığını derece cinsinden giriniz : ");
        sicaklik=girdi.nextInt();

        if(sicaklik<5){
            System.out.println("Kayağa gidebilirsiniz.");
        }
        
        else if(sicaklik<=25){
            
            if(sicaklik<=15 && sicaklik>=10){
                System.out.println("Sinemaya gidebilirsin\nPikniğe gidebilirsin");
            }
            
            else if(sicaklik<10){
                System.out.println("Sinemaya gidebilirsin");
            }

            else{
                System.out.println("Pikniğe gidebilirsin");
            }
        }
        
        else{
            System.out.println("Yüzmeye gidebilirsin");
        }
    }
}
