package org.example.Type_of_Classes.Enum_Classes;

public class main {
    public static void main(String[] args) {
        EnumSample enumSample=EnumSample.getEnumFromValue(107);
        System.out.println(enumSample.getComment());
        Method_overriding_by_enum day = Method_overriding_by_enum.MONDAY;
        System.out.println(day.type());

    }
}
