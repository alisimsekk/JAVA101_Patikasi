package Metodlar;
import java.util.Scanner;

public class recursiveAsalSayiBulma {

    static boolean isPrime(int a,int i){
        if(i>=a){
            return true;
        }
        if(a%i==0){
           return false;
         }
        else return isPrime(a,i+1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int a= input.nextInt();

        if(isPrime(a,2)){
            System.out.println(a + " Asal Sayıdır");
        }
        else{
            System.out.println(a + " Asal Sayı Değildir");
        }
    }
}