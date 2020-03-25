package com.company;

public class Rectangle extends GeometricFigure {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void caclulateArea() {
         int rectangle = this.a * this.b;
        System.out.println("Rectangle Area: " + rectangle);
    }

    @Override
    public void drawArea() {
        for (int i = 0; i < this.a; i++) {
            for (int j = 0; j < this.b ; j++) {
                System.out.print("\tX");
            }
            System.out.println();
        }
    }
}
