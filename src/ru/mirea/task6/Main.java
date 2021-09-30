package ru.mirea.task6;

public class Main {
    public static void main(String[] args) {

        Pet cat = new Pet("Вася");
        Car car = new Car();
        Fuel ai95 = new Fuel(50);

        System.out.println(cat.getName());
        System.out.println(car.getName());
        System.out.println(ai95.getPrice());
        System.out.println(car.getPrice());
    }
}