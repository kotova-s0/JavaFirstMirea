package ru.mirea.task23;

public class Client {
    private Chair chair;

    public void sit() {
        System.out.println("Сидит на " + chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
