package Metodlar;

import java.util.Scanner;

public class palindromSayiBulma {
    static boolean isPalindrom(int numb){
        int temp, lastDigit, reverseNumb=0;
        temp = numb;
        while(temp != 0){
            lastDigit = temp%10;
            reverseNumb = (reverseNumb*10) + lastDigit;
            temp /=10;
        }

        if(numb == reverseNumb){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        n = input.nextInt();

        if(isPalindrom(n)== true){
            System.out.println(n + " sayısı Palindrom sayıdır.");
        }
        else {
            System.out.println(n + " sayısı Palindrom sayı değildir.");
        }
    }
   
}   //  www.patika.dev 
