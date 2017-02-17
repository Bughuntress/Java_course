package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("World!");
        hello("Baby");
        hello("Zakhidat Xanim!");
        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной "+s.l+" равна "+s.area());
        Rectangle r = new Rectangle(2,2);
        System.out.println("Площадь квадрата со стороной "+r.a+" и со стороной "+r.b+" равна "+r.area());
    }

    public static void hello(String smbd) {

        System.out.println("Hello, "+smbd);
    }


}