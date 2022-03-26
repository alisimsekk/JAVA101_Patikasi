package Siniflar.Boks_Oyunu;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    Fighter(String name, int damage, int health, int weight, double dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >=0 && dodge <=100){
            this.dodge = dodge;
        }
        else{
            this.dodge = 0;
        }
    }

    public int hit (Fighter foe){
        System.out.println("/-/-/-/-/-/-/-/-");
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar verdi.");

        if(foe.isdodge()){
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }
        if(foe.health - this.damage < 0)
        return 0;

        return foe.health - this.damage;


    }

    public boolean isdodge(){
        double randomValue = Math.random()*100;
        return randomValue <= this.dodge;
    }
}
