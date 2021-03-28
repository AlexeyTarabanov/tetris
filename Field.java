package com.javarush.task.task22.task2213;

/**
 * Класс отвечающий за поле с клетками.
 * Он будет отвечать за хранение данных о текущих занятых и свободных клетках на поле игры.
 */
public class Field {

    // ширина
    private int width;
    // высота
    private int height;
    // кроме формы объекта, матрица содержит порядковый номер цвета
    // ячейка с координатами x, y - это matrix[y][x]
    private int[][] matrix;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public Field(int width, int height) {
        this.width = width;
        this.height = height;
        matrix = new int[height][width];
    }
}
