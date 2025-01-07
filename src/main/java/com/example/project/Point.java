package com.example.project;

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
    
    // Returns distance between this Point object and another Point object

    public int getX(){
      return x;
    }
    public int getY(){
      return y;
    }
    public void setX(int X){
      x = X;
    }
    public void setY(int Y){
      y = Y;
    }
    public double distanceTo(Point other) {
      return Math.sqrt(Math.pow(x-other.getX(),2)+ Math.pow(y-other.getY(),2));
    }
  
    // Returns a string in the format: (x, y)
    public String pointInfo() {
      return "(" + x +", " + y +")"; 
    }
  }
  