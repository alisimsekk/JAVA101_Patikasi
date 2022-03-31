import java.util.Scanner;

public class palindromikKelimeBulma {
    static boolean isPalindromik(String str){
        int i = 0;
        int j = str.length()-1;
        
        while(i<j){
            if (str.charAt(i) != str.charAt(j))
            return false;
        i++;
        j--;
        }   
        return true;
    }
    public static void main(String [] Args) {
        Scanner input = new Scanner (System.in);
        String str = "";
        System.out.print("Test kelimesini giriniz : ");
        str = input.nextLine();
        
        if(isPalindromik(str)){
            System.out.println(str + " kelimesi palindromiktir.");
        }
        else{
            System.out.println(str + " kelimesi palindromik değildir.");
        }
        
    }
    
}