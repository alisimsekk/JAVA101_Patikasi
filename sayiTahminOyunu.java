import java.util.Scanner;
import java.util.Arrays;
public class sayiTahminOyunu {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        int random = (int) (Math.random()*100);
        int right = 0;
        int guess;
        int [] dizi = new int [5];
        boolean isWrong = false;
        boolean isWin = false;
        
        System.out.println("0 ile 100 arasında oluşturulan rastgele sayıyı 5 denemede bulmaya çalışınız.");

        while(right<5){
            System.out.print("Lütfen tahmininizi giriniz : ");
            guess = input.nextInt();

            if (guess < 0 || guess > 99){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz." );
                if(isWrong){
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                }
                else{
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if(random == guess){
                System.out.println("Tebrikler kazandınız. Rasgele sayı : " + random);
                isWin = true;
                break;
            }

            else{
                System.out.println("Bilemediniz");
                if(guess<random)
                System.out.println("Rasgele sayı daha büyük.");
                
                else{
                    System.out.println("Rasgele sayı daha küçük.");
                }
                dizi[right] = guess;
                right++;
                System.out.println("Kalan hakkı : " + (5 - right));
            }
    
        }
        if(!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(dizi));
            }
        }
    }
    
} //www.patika.dev
