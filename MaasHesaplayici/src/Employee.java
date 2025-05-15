public class Employee {
    String name;//Çalışanın adı ve soyadı
    double salary;//Çalışanın maaşı
    int workHours;//Haftalık çalışma saati
    int hireYear;//İşe başlangıç yılı

    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    double tax(){//Maaşa uygulanan vergiyi hesaplar.
        double tax=0;
        if(salary>1000){
            tax=salary*0.03;
        }
        return tax;
    }
    double bonus(){
        double extraPay=0;
        if(workHours>40){
            extraPay= (workHours-40)*30;
        }
        return extraPay;
    }
    double raiseSalary(){
        int nowaday=2021;//Şuanki yıl 2021
        double raise=0;//zam
        if(nowaday-hireYear<10){
            raise=salary*0.05;
        }
        else if(nowaday-hireYear>9 && nowaday-hireYear<20){
            raise=salary*0.10;
        }
        else if (nowaday-hireYear>19){
            raise=salary*0.15;
        }
        return raise;
    }

    public String toString(){
        return "Adı : "+name+"\n"
                +"Maaşı : "+salary+ "\n"
                +"Çalışma saati: "+ workHours+"\n"
                +"Başlangıç yılı: "+ hireYear+"\n"
                +"Vergi : "+tax()+"\n"
                +"Bonus : "+bonus()+ "\n"
                +"Maaş artışı : "+raiseSalary()+"\n"
                +"Vergi ve bonuslar ile birlikte maaş: " + (salary-tax()+bonus()) +"\n"
                +"Toplam maaş: "+(salary+raiseSalary());
    }
}
