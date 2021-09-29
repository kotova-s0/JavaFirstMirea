package ru.mirea.task5.second;

public class Bulldog extends Dog
{
    public Bulldog(String color, String size)
    {
        super(color, size);
    }

    @Override
    public String toString()
    {
        return ("It's a " +size+" size " +color+ " bulldog.");
    }
}
