package game;

import java.util.Scanner;

public class ThinkTheNumber {
    private static int number = (int) (Math.random() * 100);
    private static String answer = "";

    public static String regNumber() {
        System.out.println("Загадай число 0 до 100 и введи 'загадал'");
        do {
            answer = new Scanner(System.in).nextLine();
        } while (!answer.equals("загадал"));
        return answer;
    }

    public static boolean checkNumber() {

        System.out.println("Я думаю, что это число " + number +
                "\nЕсли я угадал введи 'правильно'" +
                "\nЕсли моё число меньше введи 'меньше' и наоборот.");
        answer = new Scanner(System.in).nextLine();
        if (answer.equals("больше")) {
            number++;
            return false;
        } else if (answer.equals("меньше")) {
            number--;
            return false;
        } else if (answer.equals("правильно") || answer.equals("да")) {
            System.out.println("Я победил, кожаный ты мешок!");
            return true;
        } else System.out.println("Так я угадал или нет?");
        return false;
    }
}
