package lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeClass03 {
    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        guessNumber(9);  
    }

    public static void guessNumber(int n) {
        int a = rand.nextInt(n);
        System.out.println("Угадайте число от 0 до 9");
        for (int i = 0; i < 3; i++) {

            int b = sc.nextInt();
            if (a == b) {
                System.out.println("Верно!");
                break;
            } else if (a < b) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
        endGame();
    }

    public static void endGame() {
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int c = sc.nextInt();
        if (c == 1) {
            guessNumber(9);
        } else if (c == 0) {
            System.out.println("До свидания!");
        }
    }
}
