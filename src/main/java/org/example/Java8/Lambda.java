package org.example.Java8;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {
        //Sorting with Lambda
        List<String>element= Arrays.asList("kaka","kwe","iofve");
        Collections.sort(element,(e1,e2)->e1.compareTo(e2));
        List<Integer>l1=Arrays.asList(4,7,9,1,2,3,12,987);
        Collections.sort(l1,(num1,num2)-> num1.compareTo(num2));
        System.out.println(l1);
        //Filtering Collections
        List<Integer>l2=Arrays.asList(6,5,3,2,1,12,98,76,45);
        List<Integer> evenNumbers = l2.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        //Find duplicate elements in a list
        List<Integer>list1=Arrays.asList(1, 2, 3, 2, 4, 5, 1);
        Set<Integer> ans= list1.stream().filter(e->Collections.frequency(list1,e)>1).collect(Collectors.toSet());
        System.out.println(ans);

        //Find the second highest number in a list

        List<Integer>list2=Arrays.asList(1, 2, 3, 2, 4, 5, 1);
        Integer ans2=list2.stream().distinct().skip(1).findFirst().orElse(null);
        System.out.println(ans2);

        //Find first non-repeated character in a string
        String str = "java streams";
        Character result = str.chars().mapToObj(c->(char)c).filter(ch->str.indexOf(ch)==str.lastIndexOf(ch)).findFirst().get();
        System.out.println(result);

        //Count frequency of elements
        List<String> list = List.of("a", "b", "a", "c", "b", "a");

        Map<String, Long> frequencyMap = list.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        System.out.println(frequencyMap); // {a=3, b=2, c=1}

        //Highest-paid employee in each department

        List<Employee> employees = List.of(
                new Employee(1, "A", "IT", 60000),
                new Employee(2, "B", "IT", 80000),
                new Employee(3, "C", "HR", 50000),
                new Employee(4, "D", "HR", 70000)
        );

        Map<String, Employee> result1 = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.dept,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(e -> e.salary)),
                                Optional::get
                        )
                ));

        result1.forEach((k, v) ->
                System.out.println(k + " -> " + v.name + " : " + v.salary)
        );

    }
}
