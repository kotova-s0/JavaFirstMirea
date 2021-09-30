package ru.mirea.task6;

public class Pet implements Nameable {
    private String name;

    public Pet(String name){
        this.name=name;
    }

    public Pet(){
        this.name ="дворовый бандит";
    }

    @Override
    public String getName() {
        return name;
    }
}