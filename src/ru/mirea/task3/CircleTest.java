package ru.mirea.task3;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        double radius;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите радиус круга:");
        radius = scan.nextDouble();
        Circle C = new Circle();
        C.setPer(radius);
        C.setSquare(radius);
        System.out.println("Периметр:");
        System.out.println(C.getPer());
        System.out.println("Площадь:");
        System.out.println(C.getSquare());
    }
}
