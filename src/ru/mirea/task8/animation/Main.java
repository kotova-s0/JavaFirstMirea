package ru.mirea.task8.animation;

import javax.swing.*;

public class Main extends Animation{
    public static void main(String[] args) {
        new Animation();
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-0.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-1.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-2.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-3.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-4.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-5.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-6.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-7.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-8.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/frame-9.png").getImage());
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
            for (int i = 0; i < 29; i++) {
                image = framlist.get(i);
                animImg.repaint();
                try {
                    Thread.sleep(38);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
