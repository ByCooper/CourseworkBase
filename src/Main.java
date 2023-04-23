import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        Employee employee1 = new Employee("Иван", "Иванов", "Сергеевич", 2, 19000);
        Employee employee2 = new Employee("Егор", "Петров", "Ильич", 1, 18000);
        Employee employee3 = new Employee("Илья", "Серов", "Александрович", 5, 13000);
        Employee employee4 = new Employee("Игнат", "Нилов", "Иванович", 3, 16000);
        Employee employee5 = new Employee("Игорь", "Валов", "Николаевич", 4, 20000);
        Employee employee6 = new Employee("Сергей", "Шинов", "Андреевич", 2, 15500);
        Employee employee7 = new Employee("Дмитрий", "Сергеев", "Олегович", 4, 19000);
        Employee employee8 = new Employee("Николай", "Цой", "Артемович", 5, 14000);
        Employee employee9 = new Employee("Тимофей", "Тян", "Дмитриевич", 3, 15200);
        Employee employee10 = new Employee("Владимир", "Вашин", "Сергеевич", 2, 18000);

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = employee6;
        employees[6] = employee7;
        employees[7] = employee8;
        employees[8] = employee9;
        employees[9] = employee10;


        System.out.println(Arrays.toString(employees));
        System.out.println();
        System.out.println("Ежемесячные расходы на зарплаты для сотрудников составляют " + allSalary(employees));
        System.out.println();
        minSalary(employees);
        System.out.println();
        maxSalary(employees);
        System.out.println();
        averageSalary(employees, allSalary(employees));
        System.out.println();
        allName(employees);
        System.out.println();

    }

    private static int allSalary(Employee[] o) {
        int sum = 0;
        int a = 0;
        for (int i = 0; i <= o.length - 1; i++) {
            a = o[i].getSalary();
            sum = sum + a;
        }
        return sum;
    }

    private static void minSalary(Employee[] o) {
        int min = o[0].getSalary();
        Employee unitMin = o[0];
        for (int i = 0; i <= o.length - 1; i++) {
            if (min > o[i].getSalary()) {
                min = o[i].getSalary();
                unitMin = o[i];
            }
        }
        System.out.println("Минимальная зарплата по организации: " + "\n" + unitMin);
    }

    private static void maxSalary(Employee[] o) {
        int max = o[0].getSalary();
        Employee unitMax = o[0];
        for (int i = 0; i <= o.length - 1; i++) {
            if (max < o[i].getSalary()) {
                max = o[i].getSalary();
                unitMax = o[i];
            }
        }
        System.out.println("Максимальная зарплата по организации: " + "\n" + unitMax);
    }

    private static void averageSalary(Employee[] o, int i) {
        double average = (double) i / o.length;
        System.out.println("Среднее занчение зарплат равно " + new DecimalFormat("###,###.##").format(average));
    }

    private static void allName(Employee[] o) {
        for (int i = 0; i <= o.length - 1; i++) {
            System.out.println(o[i].getMiddleName() + " " + o[i].getFirstName() + " " + o[i].getLastName());
        }
    }
}