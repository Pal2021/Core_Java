package org.example.StringInJava;

public class LearningString {
    public static void main(String[] args) {
        String s="hello";
        String s1=new String("hello");
        System.out.println(s==s1);

        char[] ch;
        ch= new char[]{'s', 't', 'e', 'n', 'y'};
        String s3=new String(ch);
        System.out.println(s3);

        String s4="hello";
        String s5="hello";
        System.out.println(s4==s5);

        //String is immutable
        String s6="hello1";
        String s7=s6.concat("world");
        System.out.println(s6);

        //Length and Character Access
        System.out.println(s6.charAt(5));
        System.out.println(s6.indexOf('1'));
        System.out.println(s6.lastIndexOf(1));

        //   Substring Operations
        System.out.println(s6.substring(1));
        System.out.println(s6.substring(1,4));



    }
}
