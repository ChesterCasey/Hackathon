package game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добрый день! Как тебя зовут?");

        String userName = "";
        int answer = 0;
        String chooseGame = "";

        do {
            userName = User.regName();
        } while (!User.checkname(userName));

        User u1 = new User(userName);


        do {
            System.out.println();
            System.out.println("Я хочу сыграть с тобой в игру!" +
                    "\n1. Угадать число." +
                    "\n2. Загадать число " +
                    "\nДля выбора введите название игры." +
                    "\nЧтобы покинуть игру введите 'Выйти'");
            chooseGame = new Scanner(System.in).nextLine();
            if (chooseGame.equals("Угадать число") || chooseGame.equals("угадать число")) {
                do {
                    do {
                        answer = GuessTheNumber.regAnswer();
                    } while (!GuessTheNumber.correctNumber(answer));
                } while (!GuessTheNumber.guessTheAnswer(answer));
            } else if (chooseGame.equals("Загадать число") || chooseGame.equals("загадать число" )) {
                ThinkTheNumber.regNumber();
                do {
                } while (!ThinkTheNumber.checkNumber());
            }
        }while (!(chooseGame.equals("Выйти") || chooseGame.equals("выйти")));
        System.out.println("До встречи, " + u1.getName() + "! Не забывай мыть руки!");
        }
    }

