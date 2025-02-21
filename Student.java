public class Student {
String name;
String stuNo;
int classes;
Course mat;
Course fizik;
Course kimya;
double average;
boolean isPass;

    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public  void addBulkSpeakNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.speakNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.speakNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.speakNote = kimya;
        }
    }

    public void isPass() {
        if ((this.mat.note == 0 || this.mat.speakNote == 0) || (this.fizik.note == 0 || this.fizik.speakNote == 0)  || (this.kimya.note == 0 || this.kimya.speakNote == 0) ) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.average = ((((((this.fizik.note) * 8) / 10.0) + ((this.fizik.speakNote) * 2) / 10.0)) + (((this.kimya.note) * 8) / 10.0) + (((this.kimya.speakNote) * 2) / 10.0) + (((this.mat.note) * 8) / 10.0) + (((this.mat.speakNote) * 2) / 10.0)) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + ((((this.mat.note) * 8) / 10.0) + (((this.mat.speakNote) * 2) / 10.0)));
        System.out.println("Fizik Notu : " + ((((this.fizik.note) * 8) / 10.0) + (((this.fizik.speakNote) * 2) / 10.0)));
        System.out.println("Kimya Notu : " + ((((this.kimya.note) * 8) / 10.0) + (((this.kimya.speakNote) * 2) / 10.0)));
    }

}
