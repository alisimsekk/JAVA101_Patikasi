package Metodlar;
import java.util.Scanner;
public class recursiveDesenOlusturma {

    static void figureDown(int a, int b){
        System.out.print(a + " ");
        if(a==0 || a<0){
            figureUp((a+5),b);
        }
        else{
            figureDown(a-5, b);
        }
    }

    static void figureUp(int a, int b){
        System.out.print(a + " ");
        if(a==b){
            return;
        }
        else{
            figureUp((a+5),b);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Bir sayı giriniz : ");
        a = input.nextInt();
        b=a;
        figureDown(a,b);
    }
} //www.patika.dev
