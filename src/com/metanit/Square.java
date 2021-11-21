package com.metanit;
import java.lang.*;

public class Square extends Rectangle{
    protected double side;
    public Square()
    {
        side=0;
        color="blue";
        filled=false;
    }
    public Square(double side)
    {
        this.side=side;
        color="blue";
        filled=false;
    }
    public Square(double side,String color,boolean filled)
    {
        this.side=side;
        this.color=color;
        this.filled=filled;
    }
    public double getSide()
    {
        return this.side;
    }
    public void setSide(double side)
    {
        this.side=side;
    }

    @Override
    public void setWidth(double width) {
        this.width=width;
    }

    @Override
    public void setLength(double length) {
        this.length=length;
    }

    @Override
    public String toString() {
        return "Shape: square, width: "+this.width+", length: "+this.length+", color: "+this.color;
    }
}

