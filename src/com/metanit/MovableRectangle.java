package com.metanit;
import java.lang.*;

public class MovableRectangle extends MovablePoint {
    private MovablePoint topleft=new MovablePoint();
    private MovablePoint bottomright=new MovablePoint();
    private int x1,y1,y2,x2;
    public void MovableRectangle(int x1,int y1,int x2,int y2,int xSpeed,int ySpeed)
    {
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        topleft.MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomright.MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    public String toString()
    {
        return "rectangle topleft "+topleft+", bottomright "+bottomright;
    }
    @Override
    public void moveUp()
    {

        topleft.moveUp();
        bottomright.moveUp();
    }

    @Override
    public void moveDown()
    {
        topleft.moveDown();
        bottomright.moveDown();
    }

    @Override
    public void moveLeft()
    {
        topleft.moveLeft();
        bottomright.moveLeft();
    }

    @Override
    public void moveRight()
    {
        topleft.moveRight();
        bottomright.moveRight();
    }
    public boolean check()
    {
        topleft.moveRight();
        bottomright.moveRight();
        topleft.moveUp();
        bottomright.moveUp();
        if (((this.x1 - topleft.x)==(this.x2 - bottomright.x))&((this.y1 - topleft.y)==(this.y2 - bottomright.y)))
            return true;
        else
            return false;
    }
}

