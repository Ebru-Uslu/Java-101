public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name;
    String studentNumber;

    String classes;
    double average;

    Student(String name,String studentNumber,String classes,Course c1,Course c2,Course c3){
        this.name=name;
        this.studentNumber=studentNumber;
        this.classes=classes;
        this.course1=c1;
        this.course2=c2;
        this.course3=c3;

    }

    void addBulkExamNote(int note1,int note2,int note3){
        this.course1.examNote=note1;
        this.course2.examNote=note2;
        this.course3.examNote=note3;

    }
    void addBulkVivaNote(int note1,int note2,int note3){
        this.course1.vivaNote=note1;
        this.course2.vivaNote=note2;
        this.course3.vivaNote=note3;

    }

    void calculateAverage(){//derslerin ortalamasını toplar ve 3e böler
        average= (course1.getAverage()+course2.getAverage()+ course3.getAverage())/3.0;
    }
    void printNote() {
        if (average >= 55) {
            System.out.println("Sınıfı geçtiniz! ");
            System.out.println("Ortalama: " + average);
        } else {
            System.out.println("Sınıfta kaldınız! ");
            System.out.println("Ortalama: " + average);
        }
    }
}
