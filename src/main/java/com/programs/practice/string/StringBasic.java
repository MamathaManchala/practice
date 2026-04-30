package com.programs.practice.string;

public class StringBasic {
    public static void main(String args[]){

        //Immutability

//        String name ="Bujji";
//        String name1 ="Bujji";
//        String name2= "Bujji";
//
//        System.out.println(name==name1);
//
//        System.out.println("before " + name);
//        name ="raj";
//        System.out.println("afer "+ name);
//        System.out.println("name1 " + name1);
//        System.out.println("name2 " + name2);
//
//        System.out.println(name==name1);


        //String comparission == and equals


//        String s = "mamatha";
//        String s1 = new String("Mamatha");
//        String s2 = new String("Mamatha");
//        String s3 = "Mamatha";
//        String s4 = "mamatha";
//        String s5 = new String("mamatha");
//
//        //true
//        System.out.println(s==s4);
//        System.out.println(s1.equals(s2));
//        System.out.println(s2.equals(s3));
//        System.out.println(s4.equals(s5));
//
//        //false
//        System.out.println(s1.equals(s4));
//        System.out.println(s==s3);
//        System.out.println(s==s2);
//        System.out.println(s.equals(s2));
//        System.out.println(s1==s5);
//        System.out.println(s4==s5);


        //String operations

//        String s1 = new String("abc");
//        String s2 = s1.intern(); //Moves string to String Constant Pool
//        System.out.println(s2);
//        System.out.println(s1==s2);
//        System.out.println("abc" == s2);
//        System.out.println(s1.equals(s2));

        //String Concatenation

//        String s = "a" + "b";
//        System.out.println(s);
//
//        StringBuilder sb = new StringBuilder();
//        sb.append("a").append("b").toString();

        //String compaareTo()

//        String s1 = "A";
//        String s2 = "A";
//        String s3 = "a";
//        String s4 = new String("A");
//
//        System.out.println(s1.compareTo(s2));
//        System.out.println(s1.compareTo(s3));
//        System.out.println(s3.compareTo(s2));
//        System.out.println(s1.compareTo(s4));


        //String equals and equalsIgnoreCase

//        String string1= new String("Apple");
//        String string2= new String("MANGO");
//        String string3= new String("APPLE");
//        System.out.println("string1 equals to string2:"+string1.equalsIgnoreCase(string2));
//        System.out.println("string1 equals to string3:"+string1.equalsIgnoreCase(string3));
//        System.out.println("string1 equals to Welcome:"+string1.equalsIgnoreCase("Welcome"));
//        System.out.println("string1 equals to Apple:"+string1.equalsIgnoreCase("Apple"));
//        System.out.println("string2 equals to mango:"+string2.equalsIgnoreCase("mango"));

        //String empty, null, blank

        String s1 = null;
        System.out.println(s1);

        String s2 = "";
        System.out.println(s2.isEmpty());   // true

        String s3 = " ";
        System.out.println(s3.isEmpty());   // false

        String s4 = "hello";
        System.out.println(s4.isEmpty());   // false

        String s5 = "";
        System.out.println(s5.isBlank());   // true

        String s6 = "   ";
        System.out.println(s6.isBlank());   // true

        String s7 = "hello";
        System.out.println(s7.isBlank()); //false

    }
}
