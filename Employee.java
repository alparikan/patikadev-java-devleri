public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;
    double tax;
    double bonus;
    double salaryRaise;
    int year = 2024;
    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double raiseSalary() {
        if ((year - hireYear) < 10) {
            salaryRaise = (salary * 5) / 100.0;
            salary += salaryRaise;
        }
        else if ((((year - hireYear) > 9) && ((year - hireYear) < 20))) {
            salaryRaise = (salary * 10) / 100.0;
            salary += salaryRaise;
        }
        else if (((year - hireYear) > 19)) {
            salaryRaise = (salary * 15) / 100.0;
            salary += salaryRaise;
        }
        return salaryRaise;
    }

    public double tax() {
        if (salary > 1000) {
            tax = (salary * 3) / 100.0;
            salary += tax;
        }
        return tax;
    }

    public double bonus() {
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
            salary += bonus;
        }
        return bonus;
    }

    public void Print() {
        System.out.println("Adı : " + name);
        System.out.println("Maaşı : " + salary);
        System.out.println("Çalışma Saati : " + workHours);
        System.out.println("Başlangıç Yılı : " + hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (salary - salaryRaise));
        System.out.println("Toplam Maaş : " + (salary + salaryRaise));
    }

}
