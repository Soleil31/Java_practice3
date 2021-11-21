package com.metanit;
import java.lang.*;

public class MovablePoint implements Movable {
    public int x,y,xSpeed,ySpeed;
    public void MovablePoint(int x,int y,int xSpeed,int ySpeed)
    {
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public String toString()
    {
        return "point position: ("+x+", "+y+")";
    }

    @Override
    public void moveUp()
    {
        this.y+=ySpeed;
    }

    @Override
    public void moveDown()
    {
        this.y-=ySpeed;
    }

    @Override
    public void moveLeft()
    {
        this.x-=xSpeed;
    }

    @Override
    public void moveRight()
    {
        this.x+=xSpeed;
    }
}
