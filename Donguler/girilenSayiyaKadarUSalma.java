package Donguler;
import java.util.Scanner;
public class girilenSayiyaKadarUSalma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=0, j=0, k=0;

        System.out.print("Bir sayı giriniz : ");
        k = input.nextInt();
        
            for(i=1;i<=k;i*=4){
                System.out.println(i);
            }
                for(j=1;j<=k;j*=5){
                    System.out.println(j);
                }       
    }
    
}
