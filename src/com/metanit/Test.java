package com.metanit;
import java.lang.*;

public class Test {
    public static void main(String[] args)
    {
        MovablePoint p1 = new MovablePoint();
        p1.MovablePoint(0 , 0 , 2 , 2);
        System.out.println(p1);
        p1.moveUp();
        p1.moveRight();
        System.out.println(p1);
        MovableCircle p2 = new MovableCircle();
        p2.MovableCircle(0,0,2,2,8);
        System.out.println(p2);
        p2.moveDown();
        p2.moveLeft();
        System.out.println(p2);
        MovableRectangle p3 = new MovableRectangle();
        p3.MovableRectangle(4,2,8,0,4,4);
        System.out.println(p3);
        p3.moveUp();
        p3.moveRight();
        System.out.println(p3);
        System.out.println(p3.check());
    }
}
