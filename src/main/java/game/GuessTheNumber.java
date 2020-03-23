package game;

import java.util.Scanner;

public class GuessTheNumber {

    private static int number =(int) (Math.random() * 100);

    public static int regAnswer() {
        System.out.println("Введи число От 0 до 100...");
        int answer = new Scanner(System.in).nextInt();
        return answer;
    }

    public static boolean correctNumber(int answer) {
        if ((answer > 100) || (answer < 0)) {
            System.out.println("Число должно быть в диапазоне от 0 до 100... Пожалуйста, введи корректное число...");
            return false;
        } else System.out.println("Число принято!");
        return true;
    }

    public static boolean guessTheAnswer(int answer) {
  //      System.out.println("Загаданное число: "+ number);
        if (answer > number) {
            System.out.println("Загаданное число меньше... Попробуй еще раз");
            return false;
        } else if (answer < number) {
            System.out.println("Загаданное число больше... Попробуй еще раз");
            return false;
        } else
            System.out.println("Загаданное число: " + number + ". У нас есть победитель!");
            return true;
        }

    }
