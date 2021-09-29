package ru.mirea.task7.movable;

public class MRectangle implements Movable {

    private final MPoint topLeft;
    private final MPoint bottomRight;

    public MRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MPoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MPoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "Top left point of rectangle now on x = " + topLeft.x + ", y = " + topLeft.y +
                "; Bottom right point on x = " + bottomRight.x + ", y = " + bottomRight.y;
    }
}
