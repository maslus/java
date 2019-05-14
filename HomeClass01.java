public class HomeClass01 {
    public static void main(String[] args) {
        byte a = 113;
        short b = 27000;
        int c = 1000000;
        long d = 12345671L;
        float e = 19.56f;
        double f = 345.654;
        char g = '$';
        boolean h = true;

        System.out.println(calculate(2, 5, 10, 2));
        System.out.println(task10and20(2,18));
        isPositiveOrNegative(0);
        System.out.println(isNegative(-3));
        greetings("Любовь");
        leapYear(0);
        leapYear(1);
        leapYear(4);
        leapYear(100);
        leapYear(101);
        leapYear(300);
        leapYear(400);
        leapYear(401);
        leapYear(404);
    }

    public static int calculate(int a, int b, int c, int d) {
        return a * (b + ( c / d ));
    }

    public static boolean task10and20(int x1, int x2){
        if ((10 <= (x1+x2)) && ((x1+x2) <= 20)){
            return true;
        }
        else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int x){
        if(x>=0) {
            System.out.println("Число положительное");
        }else  {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int x){
        if( x < 0 ){
            return true;
        }
        else {
            return false;
        }
    }

    public  static void greetings(String name){
        System.out.println("Привет, " + name + "!");
    }

    public static void leapYear(int x) {
        if ((x%=400)==0) {
            System.out.println("Год високосный");
        }
        else if ((x%=100)==0){
            System.out.println("Год невисокосный");
        }
        else if ((x%=4)==0) {
            System.out.println("Год високосный");
        }
        else {
            System.out.println("Год невисокосный");
        }
    }
}
