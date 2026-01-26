package org.example.Java8.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Rahul", 50000, "IT"),
                new Employee("Amit", 60000, "HR"),
                new Employee("Sneha", 75000, "IT"),
                new Employee("Neha", 45000, "Finance"),
                new Employee("Vikas", 90000, "IT"),
                new Employee("Pooja", 55000, "HR"),
                new Employee("Arjun", 65000, "Finance"),
                new Employee("Kiran", 70000, "IT"),
                new Employee("Rohit", 48000, "Support"),
                new Employee("Anjali", 82000, "IT"),
                new Employee("Suresh", 52000, "Support"),
                new Employee("Meena", 58000, "Finance"),
                new Employee("Deepak", 95000, "IT"),
                new Employee("Nikita", 62000, "HR"),
                new Employee("Manish", 40000, "Support")
        );

        long  ans=employeeList.stream().filter((emp)->emp.salary>50000).count();
        System.out.println(ans);
        List<Employee>ans2=employeeList.stream().filter((emp)->emp.salary>50000).collect(Collectors.toList());
        System.out.println(ans2);

        Integer arr[]= {23,56,98,12,45,67,98};
        Stream<Integer>streamArray= Arrays.stream(arr);
        Solve(employeeList);

    }

    private static void Solve(List<Employee> employees) {
        // 1. Filter & Collect: Find all employees with salary > 50000
        List<Employee> highEarners = employees.stream()
                .filter(e -> e.salary > 70000)
                .collect(Collectors.toList());
        System.out.println("1. High Earners: " + highEarners.stream().map(e -> e.name).collect(Collectors.toList()));

        //2. Get a list of all employee names.
        System.out.println(employees.stream().map(emp->emp.name).collect(Collectors.toList()));

        //3.Count: Count the total number of employees in the "IT" department.
        Long TotalITEmployee= employees.stream().filter(emp->emp.department.equals("IT")).count();
        System.out.println("3. IT Count: " + TotalITEmployee);

        // 4.Sorting: Sort employees by salary in descending order and collect them into a list.
       List<Employee>SortedBySalary= employees.stream().sorted((emp1,emp2)->Double.compare(emp1.salary, emp2.salary)).collect(Collectors.toList());

        System.out.println(SortedBySalary);
        for(Employee emp:SortedBySalary){
            System.out.println(emp.name+"->"+emp.salary);
        }
        //5. Max with Comparator: Find the employee with the highest salary.
        Optional<Employee> maxSalaryEmp = employees.stream().max(Comparator.comparingDouble(e->e.salary));
        System.out.println("5. Highest Paid: " + maxSalaryEmp.map(e -> e.name).orElse("None"));

        //6. Average with mapToDouble: Calculate the average salary of all employees.
        double avgSalary = employees.stream().mapToDouble(e->e.salary).average().orElse(0.0);
        System.out.println("6. Average Salary: " + avgSalary);

       //7. GroupingBy: Group employees by department and return a Map<String, List<Employee>>.

        Map<String, List<Employee>> byDepartment= employees.stream().collect(Collectors.groupingBy(e->e.department));
        System.out.println("7. By Department: " + byDepartment.keySet());

        //8. GroupingBy + Counting: Create a map showing the count of employees in each department Map<String, Long>.
        Map<String, Long> countByDept= employees
                .stream()
                .collect(Collectors.groupingBy(e->e.department,Collectors.counting()));
        System.out.println("8. Count by Dept: " + countByDept);

        //9. GroupingBy + Averaging: Find the average salary for each department Map<String, Double>.
        Map<String, Double>avgSalaryByDept=employees
                .stream()
                .collect(Collectors.groupingBy(e->e.department,Collectors.averagingDouble(e->e.salary)));
        System.out.println("9. Avg Salary by Dept: " + avgSalaryByDept);
        /*10. Complex Aggregation: Find the department with the highest average salary.
         Return the department name (hint: you'll need groupingBy, averaging, then
          stream over the map entries to find max).
         */
        Optional<Map.Entry<String, Double>> highestAvgDept = avgSalaryByDept.entrySet().stream()
                .max(Map.Entry.comparingByValue());
        System.out.println("10. Highest Avg Dept: " + highestAvgDept.map(Map.Entry::getKey).orElse("None"));










    }
}
