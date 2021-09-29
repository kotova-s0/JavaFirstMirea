package ru.mirea.task8.animation;

import javax.swing.*;

public class Main extends Animation{
    public static void main(String[] args) {
        new Animation();
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-01.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-02.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-03.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-04.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-05.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-06.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-07.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-08.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-09.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-10.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-11.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-12.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-13.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-14.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-15.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-16.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-17.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-18.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-19.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-20.png").getImage());
        Animation animImg = new Animation();
        while (true) {
            for (int i = 0; i < 20; i++) {
                image = framlist.get(i);
                animImg.repaint();
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
