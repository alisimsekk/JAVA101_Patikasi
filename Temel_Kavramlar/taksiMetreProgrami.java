package Temel_Kavramlar;

import java.util.Scanner;

public class taksiMetreProgrami {
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);

        double kmUcreti, mesafe, odenecek, tutar, acilis;
        
        acilis = 10;
        kmUcreti = 2.2;

        System.out.print("Gidilen mesafeyi km olarak giriniz :");
        mesafe = input.nextDouble();

        tutar = acilis + (mesafe*kmUcreti);

        odenecek = (tutar<20) ? 20 : tutar;

        System.out.println("Ödemeniz :" + odenecek + "TL");

    }
}
