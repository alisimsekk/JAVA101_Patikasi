package Temel_Kavramlar;

import java.util.Scanner;

public class ucgenAlanHesabi {
    public static void main (String [] args){
        double a, b, c, u, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin 1. kenar ölçüsünü giriniz : ");
        a = input.nextDouble();

        System.out.print("Üçgenin 2. kenar ölçüsünü giriniz :");
        b = input.nextDouble();

        System.out.print("Üçgenin 3. kenar ölçüsünü giriniz :");
        c = input.nextDouble();

        u = (a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Alanı :" + alan);


    }
}
