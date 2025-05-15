public class Main {
    public static void main(String[] args) {
        Teacher t1= new Teacher("Fatma Ayaz","0507","Numeric");
        Teacher t2= new Teacher("Yılmaz Atay","0506","Algoritmalar");
        Teacher t3= new Teacher("Can Gür","0505","Academic English");

        Course c1= new Course("Numeric","206","CENG206",20);
        Course c2= new Course("Algoritmalar","218","BM218",40);
        Course c3= new Course("Academic English","204","ENG204",60);

        Student s1=new Student("Abdussamet Doğan","36","4",c1,c2,c3);
        Student s2=new Student("Ebru Nur Uslu","80","3",c1,c2,c3);

        c1.addTeacher(t1);
        c1.printTeacher();

        s1.addBulkExamNote(50,60,70);//sınav notları
        s1.addBulkVivaNote(30,80,45);//sözlü notları
        s1.calculateAverage();
        s1.printNote();
    }
}