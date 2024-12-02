import org.example.Employee;
import org.example.Park;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Марьина Мария", "Инженер", "Маша@mail.рф", "892312312", 30000, 30);
        employees[1] = new Employee("Дарьина Дарья", "Менеджер", "Даша@mail.рф", "891122233", 40000, 40);
        employees[2] = new Employee("Анина Анна", "Программист", "Аня@mail.рф", "893344556", 50000, 25);
        employees[3] = new Employee("Катина Екатерина", "Повар", "Катя@mail.рф", "894455667", 35000, 35);
        employees[4] = new Employee("Ингина Инга", "Охранник", "Инга@mail.рф", "895566778", 28000, 45);

        // Вывод информации о сотрудниках
        employees[0].printInfo();
        employees[1].printInfo();
        employees[2].printInfo();
        employees[3].printInfo();
        employees[4].printInfo();
    }
}



