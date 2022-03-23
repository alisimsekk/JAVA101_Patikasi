package Siniflar.Ogrenci_Bilgi_Sistemi;

public class Student {
    String name, stuNo;
    int classses;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    public Student (String name, int classses, String stuNo, Course mat, Course fizik, Course kimya){
        this.name = name;
        this.stuNo = stuNo;
        this.classses = classses;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya, int quizMat, int quizFzk, int quizKmy){
        if (mat>= 0 && mat <= 100){
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

        if(quizMat >= 0 && quizMat <= 100 ){
            this.mat.quizNote = quizMat;
        }

        if(quizFzk >= 0 && quizFzk <= 100 ){
            this.fizik.quizNote = quizFzk;
        }

        if(quizKmy >= 0 && quizKmy <= 100 ){
            this.kimya.quizNote = quizKmy;
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.note * 0.8 + this.fizik.quizNote * 0.2) + (this.kimya.note * 0.8 + this.kimya.quizNote * 0.2) + (this.mat.note * 0.8 + this.mat.quizNote * 0.2))  / 3;

    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }
}
