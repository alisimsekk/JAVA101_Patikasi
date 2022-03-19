package Donguler;

import java.util.Scanner;

public class fibonacciSerisiYazma{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Bir sayı giriniz : ");
        num = input.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.print(a + " " + b);

        for(int i=0;i<num;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+ c);
        }
    }
}