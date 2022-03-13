package Temel_Kavramlar;

import java.util.Scanner;

public class daireAlaniHesaplama {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double r, pi, cevre, alan, aci;
        pi = 3.14;

        System.out.print("Dairenin yarıçapını cm olarak giriniz :");
        r = input.nextDouble();

        System.out.print("Dairenin merkez açısını derece olarak giriniz :");
        aci = input.nextDouble();

        alan = (pi*r*r*aci)/360;

        System.out.println("Daire diliminin alanı :" + alan +" cm2");
    }
}
