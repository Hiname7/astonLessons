package task_1and2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Казимов Фируз Рустамович", "AQA JAVA", "sondzinvu@gmail.com",
                "+79206371462", 50000, 20);
        employee.printEmployee();

        System.out.println();

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Казимов Фируз Рустамович", "AQA JAVA", "sondzinvu@gmail.com",
                "+79206371462", 50000, 20);
        employees[1] = new Employee("Казимов Фируз Рустамович", "AQA JAVA", "sondzinvu@gmail.com",
                "+79206371462", 50000, 20);
        employees[2] = new Employee("Казимов Фируз Рустамович", "AQA JAVA", "sondzinvu@gmail.com",
                "+79206371462", 50000, 20);
        employees[3] = new Employee("Казимов Фируз Рустамович", "AQA JAVA", "sondzinvu@gmail.com",
                "+79206371462", 50000, 20);
        employees[4] = new Employee("Казимов Фируз Рустамович", "AQA JAVA", "sondzinvu@gmail.com",
                "+79206371462", 50000, 20);

    }
}
