public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private float salary;
    private int age;

    Employee(String fullName, String position, String email, String phoneNumber, float salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        if (this.check()) {
            System.out.println("ФИО: " + fullName + "\nДолжность: " + position + "\nЭл. почта: " + email + "\nНомер телефона: " + phoneNumber + "\nЗарплата: " + Float.toString(salary) + "\nВозраст: " + Integer.toString(age));
        } else {
            System.out.println("Объект сотрудника содержит некорректные данные");
        }
    }

    public static void printArray(Employee[] empArray) {
        for (Employee employee : empArray) {
            System.out.println();
            employee.print();
        }
    }

    public boolean check() {
        if (!(this.email.matches("^(.+)@(\\S+)$"))) {
            return false;
        } else if (!(this.phoneNumber.matches("^(\\+\\d{1,3}( )?)?[\\s- .]?((\\(\\d{1,3}\\))|\\d{1,3})[\\s- .]?\\d{3,4}[\\s- .]?\\d{2}[\\s- .]?\\d{2}$"))) {
            return false;
        } else if (this.salary < 0) {
            return false;
        } else if ((this.age < 0) || (this.age > 118)) {
            return false;
        } else {
            return true;
        }
    }

}
