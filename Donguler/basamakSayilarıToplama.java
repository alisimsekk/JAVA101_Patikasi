package Donguler;
import java.util.Scanner;
public class basamakSayilarıToplama {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int sayi, toplam =0, a ;

        System.out.print("Basamak değerleri toplanacak sayıyı giriniz :");
        sayi = input.nextInt();
        a = sayi;

        while(sayi !=0){
            a %=10;            
            toplam +=a;
            sayi /=10;
            a = sayi;
        }
        
        System.out.println("Basamak değerleri toplamı :" + toplam);
    }
}
