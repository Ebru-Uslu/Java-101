public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int examNote;
    int vivaNote;
    int vivaEffect;

    Course(String name,String code,String prefix,int vivaEffect){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.vivaEffect=vivaEffect;
        int note=0;
    }

    double getAverage(){
        return  (((vivaNote*vivaEffect)+(examNote*(100-vivaEffect)))/100);
        //sözlü notu * sözlünün ortalamaya etkisi + sınav notu * ortalamaya etkisi
    }
    void addTeacher(Teacher teacher){
        if(this.name.equals(teacher.branch)){
            //Course adı ve öğretmen branşı eşleşiyorsa
           this.teacher =teacher;
           System.out.println("Öğretmen ataması başarılı");
        }
        else {
            System.out.println("Öğretmen ve branş uymuyor");
        }

    }

    void printTeacher(){
        if(teacher==null){
            System.out.println("Öğretmen ataması yapılmamış");
            return;
        }
        System.out.println("Öğretmen adı: " +teacher.name);
        System.out.println("Numara: " + teacher.phoneNumber);
        System.out.println("Ders adı: " +teacher.branch);
    }
}
