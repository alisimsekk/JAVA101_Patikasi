package Donguler;
import java.util.Scanner;

public class usHesaplamaProgramı {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, sonuc=1;

        System.out.print("Üssü alınacak sayıyı girin : ");
        a = input.nextInt();

        System.out.print("Üs değerini girin :");
        b = input.nextInt();

        for (int i=0;i<b;i++){
            sonuc *=a;
        }

        System.out.println("Sonuç :" + sonuc);
    }
}
