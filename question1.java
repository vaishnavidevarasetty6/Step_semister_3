import java.util.*;

class Employee {
    private int employeeId;
    private String employeeName;
    private double basicSalary;

    Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    double calculateSalary() {
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double pf = basicSalary * 0.12;

        double netSalary = basicSalary + hra + da - pf;

        if (basicSalary > 50000) {
            netSalary = netSalary - 2000;
        }

        return netSalary;
    }

    void display() {
        System.out.printf("%d %s %.2f%n",
                employeeId, employeeName, calculateSalary());
    }
}

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double salary = sc.nextDouble();

            Employee e = new Employee(id, name, salary);
            e.display();
        }

        sc.close();
    }
}