package com.javarush.task.task22.task2213;

/**
 * Главный класс.
 *
 * Пишем программу "сверху вниз".
 * Сначала решили, какие классы нам нужны. Затем - какие методы.
 * А потом уже начнем писать код этих методов.
 * Таким образом мы разбиваем большую задачу на множество маленьких.
 * Когда код всех методов будет готов, останется только проверить - так ли все работает, как должно быть.
 * И если надо - внести некоторые изменения.
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
