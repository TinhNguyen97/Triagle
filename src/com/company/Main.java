package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Triagle triagle=new Triagle();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh a:");
        triagle.setSide1(scanner.nextDouble());
        System.out.print("Nhập độ dài cạnh b:");
        triagle.setSide2(scanner.nextDouble());
        System.out.print("Nhập độ dài cạnh c:");
        triagle.setSide3(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Nhập màu sắc tam giác:");
        Shape shape=new Shape();
        shape.setColor(scanner.nextLine());
        shape=new Shape(triagle.getSide1(), triagle.getSide2(), triagle.getSide3(), shape.getColor());
        System.out.println(shape);

    }
}
