public class Main {

    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Асторов Денис Витальевич", "Главный инженер", "denisyo@aboba.ru", "+375291895678", 3452f, 38);
        empArray[1] = new Employee("Нункай Элеонора Дмитриевна", "Маркетолог", "elka@gmail.com", "+375296875412", 2148.51f, 32);
        empArray[2] = new Employee("Петров Петр Анатольевич", "CEO", "petroo@yandex.ru", "+375442987490", 4987.35f, 53);
        empArray[3] = new Employee("Нга Ба Куанг Минь", "Системный программист", "vietnga@google.com", "+375299073541", 2736.78f, 29);
        empArray[4] = new Employee("Саддам ибн-Хайдиль", "Врач", "sihil@mail.ru", "+375441018975", 1923.1f, 118);
        Employee.printArray(empArray);

        int[] horkyDayOffs = {1, 3, 6};
        Park Horky = new Park("Горький");
        Park.Attraction ratFights = Horky.new Attraction("Крысиные бои", 16, 30, 23, 0, 19, 45, 20, 0, 25f, horkyDayOffs);
        ratFights.printInfo();
    }

}
