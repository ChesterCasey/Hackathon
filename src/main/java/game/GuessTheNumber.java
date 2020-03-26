package game;

import java.util.Scanner;

public class GuessTheNumber {

    private static int number = (int) (Math.random() * 100);
    private static int answer;

    public static int regAnswer() {
        return answer = new Scanner(System.in).nextInt();
    }

    public static boolean correctNumber(int answer) {
        if ((answer > 100) || (answer < 0)) {
            System.out.println("Число должно быть в диапазоне от 0 до 100... Пожалуйста, введи корректное число...");
            return false;
        } else {
            System.out.println("Число принято!");
            return true;
        }
    }

    public static boolean guessTheAnswer(int answer) {
        if (answer > number) {
            System.out.println("Загаданное число меньше... Попробуй еще раз");
            return false;
        } else if (answer < number) {
            System.out.println("Загаданное число больше... Попробуй еще раз");
            return false;
        } else {
            System.out.println("Загаданное число: " + number + ". У нас есть победитель!");
            return true;
        }
    }

}
