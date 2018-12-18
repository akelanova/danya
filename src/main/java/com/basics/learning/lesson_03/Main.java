package com.basics.learning.lesson_03;

// Что-то новое появилось? Что это значит?
import java.util.Scanner;
// Мы воспользовались расширенным функционалом языка
// теперь мы можем принимать данные из консоли


/**
 * Каких типов бывают переменные?
 *
 * @author Lyubov
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int nextInt = scanner.nextInt();

        System.out.println("Наше число: " + nextInt);
    }
}
