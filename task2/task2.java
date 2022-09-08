/*
Задание 2
Напишите программу, 
которая считает, распарсит и выведет в 
логгер заранее созданный файл с именами, 
предметами и оценками студентов
Формат строк в файле:
Андрей 5
Алена 5
Игорь 4
Формат вывода: Ученик %s получил сегодня %d.
 */
package task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Logger l = Logger.getAnonymousLogger();
        ConsoleHandler ch = new ConsoleHandler();
        l.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);
        File file = new File(
                "P:\\02_Отдел_Продаж\\Бохан Д. А\\Учеба\\Java знакомство и как пользоваться базовым API (лекции)\\семинары\\Урок 2. Почему вы не можете не использовать API\\домашнее задание\\task2\\file.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String str = "Ученик " + scanner.next() + " получил сегодня " + scanner.next() + "\n";
            l.info(str);
        }

        scanner.close();
    }
}
