package com.metanit;
import java.lang.*;
import java.math.*;

public class Circle extends Shape {
    protected double radius;

    public Circle()
    {
        radius=1;
        color="blue";
        filled=false;
    }
    public Circle(double radius)
    {
        this.radius=radius;
        color="blue";
        filled=false;
    }
    public Circle(double radius,String color,boolean filled)
    {
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Shape: circle, radius: "+this.radius+", color: "+this.color;
    }

    @Override
    public double getSide() {
        return 0;
    }
}

