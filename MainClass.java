package lesson7.cats;

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik", 15);
        Cat cat2 = new Cat("Barsik", 20);

        Plate plate1 = new Plate(100);
        Plate plate2 = new Plate(19);

        System.out.println(cat1.satiety(cat1));
        System.out.println(plate1);
        cat1.eat(plate1);
        System.out.println(cat1.satiety(cat1));
        System.out.println(plate1);

        System.out.println();

        System.out.println(cat2.satiety(cat2));
        System.out.println(plate2);
        cat2.eat(plate2);
        System.out.println(cat2.satiety(cat2));
        System.out.println(plate2);

        System.out.println();

        Cat[] cats = new Cat[4];
        cats[0]= new Cat("Pushok", 30);
        cats[1]= new Cat("Snezhok", 25);
        cats[2]= new Cat("Murka", 26);
        cats[3]= new Cat("Kisa", 16);

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].satiety(cats[i]));
            cats[i].eat(plate1);
            System.out.println(cats[i].satiety(cats[i]));
            System.out.println();
        }

        plate1.addFood(50);
        cats[3].eat(plate1);
        System.out.println(cats[3].satiety(cats[3]));


//        System.out.println();

//        Dog dog = new Dog("Tuzik");
//        dog.voice(cat);
//
//        Dog dog1 = new Dog("Vulkan");
//        dog1.voice(cat);
    }
}
