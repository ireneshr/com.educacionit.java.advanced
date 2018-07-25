
package com.educacionit.java.advanced.classes;


public class C {


    public C () {

        super ();

        D d = new D ();
        d.sayHello ();

        C.D d2 = new C.D ();
        d2.sayHello ();
    }


    public class D {

        public void sayHello () {

            System.out.println ("Hello World !!!");
        }
    }

    public static void main (String[] args) {

        C a = new C ();
        D s = a.new D();

        //Como D no es estatica tengo que crear una clase C y a esta se le crea una clase D
    }
}