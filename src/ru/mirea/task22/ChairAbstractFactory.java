package ru.mirea.task22;

public interface ChairAbstractFactory {
    public FunctionChair createFunctionChair();
    public MagicChair createMagicChair(String material);
    public VictorianChair createVictorianChair(String owner);
}