package Lab3.Task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создаем несколько объектов Employee и Manager
        Employee employee1 = new Employee("Alice", 5000, new Date(2022, 4, 10), "99998489"); // Параметры: имя, зарплата, дата приема на работу
        Employee employee2 = new Employee("Bob", 4500, new Date(2021, 7, 15), "55445646");
        Manager manager1 = new Manager("Charlie", 7000, new Date(2020, 1, 5), "5545455", 1500); // Параметры: имя, зарплата, дата приема, бонус
        Manager manager2 = new Manager("David", 7000, new Date(2019, 3, 22), "4648646465", 1990);

        // Создаем коллекцию для хранения сотрудников
        Vector<Employee> employees = new Vector<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(manager1);
        employees.add(manager2);

        // Сортируем сотрудников по зарплате и бонусу (через compareTo())
        Collections.sort(employees);
        System.out.println("Сотрудники, отсортированные по зарплате и бонусу:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Сортируем сотрудников по имени (через компаратор byName)
        Collections.sort(employees, Manager.byName);
        System.out.println("\nСотрудники, отсортированные по имени:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Сортируем сотрудников по дате приема на работу (через компаратор byHireDate)
        Collections.sort(employees, Manager.byHireDate);
        System.out.println("\nСотрудники, отсортированные по дате приема на работу:");
        for (Employee e : employees) {
            System.out.println(e);
        }


        // Клонируем сотрудников
        try {
            Employee clonedEmployee1 = employee1.clone();
            Employee clonedEmployee2 = employee2.clone();
            Manager clonedManager1 = manager1.clone();
            Manager clonedManager2 = manager2.clone();

            // Выводим клонированные объекты
            System.out.println("\nКлонированные объекты:");
            System.out.println(clonedEmployee1);
            System.out.println(clonedEmployee2);
            System.out.println(clonedManager1);
            System.out.println(clonedManager2);

            System.out.println("\nПроверка, что оригинальный и клонированный объекты разные:");
            System.out.println("employee1 == clonedEmployee1: " + (employee1 == clonedEmployee1)); // Должно быть false
            System.out.println("manager1 == clonedManager1: " + (manager1 == clonedManager1)); // Должно быть false

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
