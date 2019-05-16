package lesson4;

// Проверка победы работает некорректно, но ошибку найти не могу.

import java.util.Random;
import java.util.Scanner;

public class HomeClass04 {
    static final int SIZE = 5;
    static final int DOTS_TO_WIN = 4;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Вы победитель!");
                break;
            }

            if (isFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Компьютер победил!");
                break;
            }

            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
        }


    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("input koord X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
//        if(map[y][x]==DOT_EMPTY){
//            return true;
//        }else{
//            return false;
//        }
    }

    public static void aiTurn() {
        int x, y;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_X;
                if (checkWin(DOT_X)) {
                    map[i][j] = DOT_O;
                    break;
                } else {
                    do {
                        x = random.nextInt(SIZE);
                        y = random.nextInt(SIZE);
                    } while (!isCellValid(y, x));
                    map[y][x] = DOT_O;
                }

            }
        }


    }

    public static boolean isFull() {
        int k = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    k++;
                }
            }
        }
        return k == 0;
    }

    public static boolean checkWin(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            int g = 0;
            for (int j = 0; j < SIZE; j++) {
                do {
                    g++;
                } while (map[i][j] == symbol);
            }
            int h = 0;
            for (int j = 0; j < SIZE; j++) {
                do {
                    h++;
                } while (map[i][j] == symbol);
            }
            if ((g == DOTS_TO_WIN + 1) || (h == DOTS_TO_WIN + 1)) {
                return true;
            }

//            if (map[i][0] == symbol && map[i][1] == symbol && map[i][2] == symbol && map[i][3] == symbol && map[i][4] == symbol) {
//                return true;
//            }
//            if (map[0][i] == symbol && map[1][i] == symbol && map[2][i] == symbol && map[3][i] == symbol && map[4][i] == symbol) {
//                return true;
//            }
        }
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;

        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == symbol) {
                a++;
            }
            if (map[i][SIZE - 1 - i] == symbol) {
                b++;
            }
            if (map[i][i + 1] == symbol) {
                c++;
            }
            if (map[i][i - 1] == symbol) {
                d++;
            }
            if (map[i][SIZE - 2 - i] == symbol) {
                e++;
            }
            if (map[i][SIZE - i] == symbol) {
                f++;
            }

        }

        if ((a == DOTS_TO_WIN) || (b == DOTS_TO_WIN) || (c == DOTS_TO_WIN) || (d == DOTS_TO_WIN) || (e == DOTS_TO_WIN) || (f == DOTS_TO_WIN))
            return true;

//        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol)return true;
//        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol)return true;
//        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol)return true;
//
//        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol)return true;
//        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol)return true;
//        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol)return true;
//
//        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol)return true;
//        if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol)return true;

        return false;
    }

}
