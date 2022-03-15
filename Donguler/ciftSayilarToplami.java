package Donguler;
import java.util.Scanner;
public class ciftSayilarToplami {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int k, toplam=0;
        boolean ciftmi = true;

        do {
            System.out.print("Tek sayı giriniz : ");
            k = input.nextInt();
            if(k%2==0){
                if(k%4==0){
                toplam += k;
                continue;
                }
                continue;                
            }
            ciftmi = false;
        }while(ciftmi);

        System.out.println("Girilen sayıların toplamı : "+ toplam);
    }
}    
