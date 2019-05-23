package lesson6.HomeClass06;

public class HomeClass06 {
    public static void main(String[] args) {
        Animal cat1 = new Animal("Кот","Барсик");
        Animal cat2 = new Cat("Мурка");
        Animal dog1 = new Animal("Собака","Тузик",400,20,1.3);
        Animal dog2 = new Animal("Собака","Шарик",600, 35,1.4);

        cat1.jump(1.2, 2);
        cat2.swim(12);
        System.out.println(dog1.run (300,400));
        System.out.println(dog2.run(700,600));
    }
}