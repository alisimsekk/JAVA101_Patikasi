package Temel_Kavramlar;

import java.util.Scanner;

public class kdvTutarıHesaplama {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        double tutar, kdv;

        System.out.print    ("Ücret Tutarını Giriniz :");
        tutar=input.nextDouble();

        kdv = (tutar<1000)? 0.18 : 0.08;
        System.out.println("KDV'siz Fiyat :" + tutar);
        System.out.println("KDV Oranı :" + kdv);
        System.out.println("KDV'li Fiyat :" + (tutar*(1+kdv)));
        System.out.println("KDV Tutarı :" + tutar*kdv);

    }
}
