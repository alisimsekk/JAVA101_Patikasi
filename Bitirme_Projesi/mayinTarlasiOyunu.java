package Bitirme_Projesi;
import java.util.Scanner;

public class mayinTarlasiOyunu {
    public static void main(String [] args){
        int rowNumber;
        int colNumber;
        Scanner input = new Scanner(System.in);

        System.out.print("Mayın tarlası satır sayısını giriniz : ");
        rowNumber = input.nextInt();

        System.out.print("Mayın tarlası sütun sayısını giriniz : ");
        colNumber = input.nextInt();
        System.out.println();

        MineSweeper mine = new MineSweeper(rowNumber, colNumber);
        mine.run();
        input.close();
    
    }
}
