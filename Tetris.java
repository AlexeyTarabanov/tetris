package com.javarush.task.task22.task2213;

/**
 * Главный класс.
 */
public class Tetris {

    // поле с клетками
    private Field field;
    // фигуры
    private Figure figure;
    public static Tetris game;

    public Field getField() {
        return field;
    }

    public Figure getFigure() {
        return figure;
    }

    public static void main(String[] args) {
        game = new Tetris();
        game.run();
    }

    // отвечает за всю игру
    public void run() {
    }

    // отвечает за один шаг в игре
    public void step() {
    }
}
