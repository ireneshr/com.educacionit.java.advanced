
package com.educacionit.java.advanced.classes;


public class A {


    private int count = 10;

    private static int sum = 20;

    //Por ser estàtica puede acceder a los otros atributos de A independienemente de si son estaticos o no
    public static class B {

        public B () {

            super ();

            A a = new A ();
            System.out.println (a.count);
            System.out.println (sum);
        }
    }

    public static void main (String[] args) {

        new A.B ();
    }
}