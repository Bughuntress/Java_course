package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("World!");
        hello("Baby");
        hello("Zakhidat Xanim!");
        double l = 5;
        System.out.println("Площадь квадрата со стороной "+l+" равна "+area(l));
        double a =2;
        double b = 2;
        System.out.println("Площадь квадрата со стороной "+a+" и со стороной "+b+" равна "+area(a,b));
    }

    public static void hello(String smbd) {

        System.out.println("Hello, "+smbd);
    }
    public static double area(double l) {
        return l*l;
    }
    public static double area(double a, double b) {
        return a*b;
    }
}