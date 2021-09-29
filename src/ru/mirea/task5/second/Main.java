package ru.mirea.task5.second;

public class Main
{
    public static void main(String[] args)
    {
        Dog bulldog = new Bulldog("white", "medium");
        System.out.println(bulldog);
        bulldog.Voice();
        Dog chau = new ChauChau("orange", "medium","a little burnt)");
        System.out.println(chau);
        chau.Voice();
    }
}