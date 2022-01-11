package com.company;

public class Shape extends Triagle {
    private String color;
    public Shape()
    {

    }
    public Shape(double side1,double side2,double side3, String color){
        super(side1,side2,side3);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Tam giác có độ dài 3 cạnh là:side1= "+getSide1()+", side 2= "+getSide2()+", side3= "+getSide3()+", có chu vi là: "+getPerimeter(getSide1(),getSide2(),getSide3())+", có diện tích là: "+getArea(getPerimeter(getSide1(),getSide2(),getSide3()))+", có màu sắc là: "+color;
    }
}
