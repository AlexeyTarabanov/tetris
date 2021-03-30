package com.javarush.task.task22.task2213;

import java.util.ArrayList;

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

    // объект будет отрисовывать на экран свое текущее состояние
    public void print() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (matrix[i][j] == 0) {
                    System.out.print(".");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }

    // будет удалять из матрицы полностью заполненные строки и сдвигать вышележащие строки вниз
    public void removeFullLines() {
        //Создаем список для хранения линий
        ArrayList<int[]> lines = new ArrayList<>();

        //Копируем все неполные линии в список.
        for (int i = 0; i < height; i++) {
            //подсчитываем количество единиц в строке - просто суммируем все ее значения
            int count = 0;
            for (int j = 0; j < width; j++) {
                count += matrix[i][j];
            }

            //Если сумма строки не равна ее ширине - добавляем в список
            if (count != width) {
                lines.add(matrix[i]);
            }
        }

        //Добавляем недостающие строки в начало списка.
        while (lines.size() < height) {
            lines.add(0, new int[width]);
        }

        //Преобразуем список обратно в матрицу
        matrix = lines.toArray(new int[height][width]);
    }

    // устанавливает переданное значение в ячейку массива (матрицы) с координатами x, y
    public void setValue(int x, int y, int value) {}

    // возвращает значение которое находится в матрице с координатами x и y
    public Integer getValue(int x, int y) {
        return null;
    }
}
