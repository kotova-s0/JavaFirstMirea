package ru.mirea.task4;

public class Main {
    public static void main(String[] args){
        Author author = new Author("Sofia","email@gmail.com",'M');
        System.out.println(author.getEmail());
        System.out.println(author.getName());
        System.out.println(author.getGender());
        author.setEmail("otherEmail@gmail.com");
        System.out.println(author.getEmail());
        System.out.println(author.toStringAuthor());

        Ball ball = new Ball(0.0,0.0);
        System.out.println(ball.toStringBall());
        ball.move(30, 15);
        System.out.println(ball.toStringBall());
    }
}