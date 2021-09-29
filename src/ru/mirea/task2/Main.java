package ru.mirea.task2;
import java.lang.*;
public class Main
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog("Bob");
        d3.SetAge(1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();

        Ball b1 = new Ball("White", 43);
        Ball b2 = new Ball("Orange");
        Ball b3 = new Ball();
        b3.setColor("Purple");
        b3.setDim(15);
        b1.OutSC();
        b2.OutSC();
        b3.OutSC();

        Book bo1 = new Book("White noise", 43);
        Book bo2 = new Book("Yorm");
        Book bo3 = new Book();
        bo3.setName("World of seas");
        bo3.setPages(125);
        bo1.OutNP();
        bo2.OutNP();
        bo3.OutNP();
    }
}
