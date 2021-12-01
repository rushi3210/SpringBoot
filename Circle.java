package com.rrd.shape;
public class Circle
{
 int radius;
 public Circle(int radius)
 {
   this.radius=radius;
 }
 public void areaOfCircle()
 {
  double area=3.14*radius*radius;
  System.out.println("Area of circle "+area);
 } 
}