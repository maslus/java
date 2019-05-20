package lesson2;

public class HomeClass02 {

    public static void main(String[] args) {
        final int i = 0;
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        findMinMax();
//        System.out.println(checkBalance(new int[]{1, 2, 2, 1}));
//        shiftArray(new int[]{1, 2, 3, 4, 5}, 3);
    }

    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            System.out.print(w[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] = w[i] * 2;
                System.out.print(w[i] + " ");
            } else {
                System.out.print(w[i] + " ");
            }
        }
        System.out.println();
    }

    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                    System.out.print(arr[i][j] + " ");
                } else if ((i + j) == (arr.length - 1)) {
                    arr[i][j] = 1;
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void findMinMax() {
        int[] arr = {8, 6, 45, 987, 1, 24, 33, 123, 6, 74};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println();
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }

//    public static boolean checkBalance(int[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        int balance = (sum / 2);
//        int check = 0;
//        for (int i = 0; i < arr.length; i++) {
//            do {
//                check += arr[i];
//            } while (check < balance);
//        }
//        if (check == balance) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }

//    public static void shiftArray(int[] arr, int n) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            if ((0 <= (i - n))&&((i - n) < arr.length)) {
//                arr[i] = arr[i - n];
//            } else if ((i - n) < 0) {
//                arr[i] = arr[arr.length - n];
//            } else if ((i - n) >= arr.length) {
//                arr[i] = arr[n - arr.length];
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
}
