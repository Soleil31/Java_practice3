package com.metanit;
import java.lang.*;

public class MovableCircle extends MovablePoint {
    private int radius;
    private MovablePoint center = new MovablePoint() ;

    public void MovableCircle (int x, int y,int xSpeed,int ySpeed,int radius)
    {
        this.radius=radius;
        center.MovablePoint(x,y,xSpeed,ySpeed);
    }

    public String toString()
    {
        return "circle central "+center+", radius: "+this.radius;
    }

    @Override
    public void moveUp()
    {

        center.moveUp();
    }

    @Override
    public void moveDown()
    {

        center.moveDown();
    }

    @Override
    public void moveLeft()
    {

        center.moveLeft();
    }

    @Override
    public void moveRight()
    {

        center.moveRight();
    }
}

