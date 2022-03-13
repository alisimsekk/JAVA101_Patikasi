package Temel_Kavramlar;

import java.util.Scanner;

public class vucutKitleIndeksiHesaplama {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double kilo, boy, indeks;

        System.out.print("Boyunucu metre cinsinden giriniz : ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu kilogram cinsinden giriniz : ");
        kilo = input.nextDouble();

        indeks = kilo / (boy *boy);
        System.out.println("Vücut Kitle İndeksiniz : " + indeks);

    }
}
