package game;

import java.util.Scanner;

public class User {
    private String name;

    public User(String userName) {
        this.name = userName;
    }

    public void setName(String userName) {
        this.name = userName;
    }

    public String getName() {
        return name;
    }

    public static String regName() {
        String name = new Scanner(System.in).nextLine();
        int namelength = name.length();
        name = name.toLowerCase();
        name = name.substring(0, 1).toUpperCase() + name.substring(1, namelength);
        return name;
    }

    public static boolean checkname(String name) {
        String[] arrOfName = name.split(" ");
        int numOfArr = arrOfName.length;
        if (numOfArr > 1 || numOfArr == 0) {
            System.out.println("Имя должно состоять из одного слова. Пожалуйста, повторите попытку...");
            return false;
        } else if (name.contains("1")||name.contains("2")||name.contains("3")||name.contains("4")||
                name.contains("5")||name.contains("6")||name.contains("7")||name.contains("8")||
                name.contains("9")||name.contains("0")) {
            System.out.println("Имя должно состоять только из букв. Пожалуйста, повторите попытку...");
            return false;
        } else {
            System.out.println("Добро пожаловать, " + name + "!");
            return true;
        }
    }
}