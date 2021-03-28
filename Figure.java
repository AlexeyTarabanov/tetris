package com.javarush.task.task22.task2213;

/**
 * Класс отвечающий за фигуры.
 * Будет описывать падающую фигурку.
 */
public class Figure {

    // координаты
    private int x;
    private int y;
    // форма объекта
    private int[][] matrix;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public Figure(int x, int y, int[][] matrix) {
        this.x = x;
        this.y = y;
        this.matrix = matrix;
    }
}
