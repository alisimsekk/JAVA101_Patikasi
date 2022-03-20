package Metodlar;
import java.util.Scanner;
public class usAlmaProgramı {

    static int pow(int a, int b){
        if(b>0){
            return a * pow(a, (b-1));
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.print("Taban değeri giriniz :");
        a = input.nextInt();

        System.out.print("Üs değeri giriniz :");
        b = input.nextInt();

        System.out.println("sonuç = " + pow(a, b));
    }
} // www.patika.dev 