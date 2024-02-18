package task_1and2;

public class Employee {
    private String name;
    private String post;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String post, String email, String phoneNumber, int salary, int age){
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployee() {
        System.out.println("ФИ0: " + name + "\nДолжность: " + post + "\nEmail: " + email +
                "\nТелефон: " + phoneNumber + "\nЗарплата: " + salary + "\nВозраст: " + age);


    }

}

