package Temel_Kavramlar;
import java.util.Scanner;
public class notOrtalamasiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik ;
    double ort;
        System.out.print("Matematik notunuzu giriniz:");
        Matematik= input.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        Fizik= input.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        Kimya= input.nextInt();

        System.out.print("Turkce notunuzu giriniz:");
        Turkce= input.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        Tarih= input.nextInt();

        System.out.print("Muzik notunuzu giriniz:");
        Muzik= input.nextInt();

        ort = ((Matematik + Fizik + Kimya + Turkce + Tarih + Muzik)/6.0);
        System.out.println("Not ortalamanız :" + ort);

        boolean sonuc = ort >= 60;
        String str = (sonuc) ? "Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(str);
    }
}