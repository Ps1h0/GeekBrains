package com.company;

public class Main {

    public static void main(String[] args) {
        Employee[] staff = new Employee[5];
        staff[0] = new Employee("Platonov", "Nikita", "Sergeevich", "Programmer",
                "a", "8-800-555-35-35", 50000, 21);
        staff[1] = new Employee("Ivanov", "Ivan", "Ivanovich", "Director",
                "b", "8-800-666-35-35", 50000, 39);
        staff[2] = new Employee("Petrov", "Petr", "Petrovich", "Manager",
                "c", "8-800-777-35-35", 50000, 48);
        staff[3] = new Employee("Sidorov", "Sidor", "Sidorovich", "Engineer",
                "d", "8-800-888-35-35", 50000, 63);
        staff[4] = new Employee("Pupkin", "Vasiliy", "Vasilievich", "Security guard",
                "e", "8-800-999-35-35", 50000, 41);

        for (Employee employee : staff) {
            if (employee.age > 40)
                employee.getInformation();
        }
    }
}
