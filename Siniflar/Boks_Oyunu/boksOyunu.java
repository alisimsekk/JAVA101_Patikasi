package Siniflar.Boks_Oyunu;

public class boksOyunu {
    public static void main (String [] args){
        Fighter Ahmet = new Fighter("Ahmet" , 15, 100, 90, 25);
        Fighter Mehmet = new Fighter("Mehmet" , 10 , 95, 100, 45);
        
        Ring r = new Ring( Ahmet, Mehmet, 90 , 100);
        r.run();
    }
}
// www.patika.dev