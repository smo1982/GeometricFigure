package com.company;

public class Square extends GeometricFigure {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public void caclulateArea() {
        int square = this.a * this.a;
        System.out.println("Square Area: " + square);
    }

    @Override
    public void drawArea() {
        for (int i = 0; i < this.a; i++) {
            for (int j = 0; j < this.a ; j++) {
                System.out.print("\tX");
            }
            System.out.println();
        }
    }
}
