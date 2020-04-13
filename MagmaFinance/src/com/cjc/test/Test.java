package com.cjc.test;

public class Test {
public static void main(String[] args) {
System.out.println("welcome");


int a=10;
//primitive to object

Integer i= new Integer(a);

System.out.println(i);

i= Integer.valueOf(a);

System.out.println(i);


int j=i;
System.out.println(j);
}
}
