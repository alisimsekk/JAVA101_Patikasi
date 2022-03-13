package Temel_Kavramlar;

import java.util.Scanner;

public class manavKasaProgrami {
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    double tutar, armutFyt, armutKilo, elmaFyt, elmaKilo, domatFyt, domatKilo, muzFyt, muzKilo, ptlcnFyt, ptlcnKilo;

    armutFyt = 2.14;
    elmaFyt = 3.67;
    domatFyt = 1.11;
    muzFyt = 0.95;
    ptlcnFyt = 5.0;

    System.out.print("Armut kaç kilo : ");
    armutKilo = input.nextDouble();

    System.out.print("Elma kaç kilo : ");
    elmaKilo = input.nextDouble();

    System.out.print("Domates kaç kilo : ");
    domatKilo = input.nextDouble();

    System.out.print("Muz kaç kilo : ");
    muzKilo = input.nextDouble();

    System.out.print("Patlican kaç kilo : ");
    ptlcnKilo = input.nextDouble();

    tutar = (armutFyt*armutKilo) + (elmaFyt*elmaKilo) + (domatFyt*domatKilo) + (muzFyt*muzKilo) + (ptlcnFyt*ptlcnKilo);
    System.out.println("Toplam Tutar : " + tutar + " TL");
    }
}
