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

    // для движения фигурки влево/вправо/вверх/вниз
    public void left() {
        if (isCurrentPositionAvailable()) {
            x--;
        }
    }

    public void right() {
        if (isCurrentPositionAvailable()) {
            x++;
        }
    }

    public void down() {
        y++;
    }

    public void up() {
        y--;
    }

    // для поворота фигурки вокруг главной диагонали
    public void rotate() {}

    // падение фигурки вниз до дна
    public void downMaximum() {}

    // проверка - может ли фигурка быть помещена в текущую позицию
    public boolean isCurrentPositionAvailable() {
        return true;
    }

    // вызывается, когда фигурка достигла дна или уперлась в другую фигурку
    // (все ее занятые клетки теперь должны добавиться в Field)
    public void landed() {}
}
