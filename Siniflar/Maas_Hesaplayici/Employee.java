package Siniflar.Maas_Hesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if (salary > 1000){
            return salary*0.03;
        }

        if (salary > 0 && salary < 1000){
            return salary;
        }
        return 0;
    }

    public int bonus(){
        if(workHours > 40){
            
            return (workHours - 40) * 30;
        }
        else{
            return 0;
        }
    }

    public double raiseSalary(){
        if((2021-hireYear) < 10 && (2021-hireYear) > 0){
            return salary*0.05;
        }

        else if((2021-hireYear) < 20 && (2021-hireYear) > 9 ){
            return salary*0.1;
        }

        else if((2021-hireYear) >19){
            return salary*0.15;
        }

        return 0.0;
        
    }

    public String toString() {
        return "Adı : " + this.name + "\n" +
            "Maaş : " + this.salary + "\n" +
            "Çalışma vakti : " + this.workHours + "\n" +
            "Başlangıç Yılı : " + this.hireYear + "\n" +
            "Vergi : " + tax() + "\n" +
            "Bonus : " + bonus() + "\n" +
            "Maaş artışı : " + raiseSalary() + "\n" +
            "Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + bonus() - tax()) + "\n" +
            "Toplam maaş : " + (salary + raiseSalary()) ;
    }

}
