package lesson6.HomeClass06;

//Животные могут выполнять действия:
// бежать, плыть, перепрыгивать препятствие.
// В качестве параметра каждому методу передается величина,
// означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).

//3. У каждого животного есть ограничения на действия
// (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
//
//        4. При попытке животного выполнить одно из этих действий,
//        оно должно сообщить результат в консоль.
//        (Например, dog1.run(150); -> результат: run: true)
//
//        5. * Добавить животным разброс в ограничениях.
//        То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

public class Animal {
    protected String type;
    protected String name;
    protected int maxlength;
    protected int maxdistance;
    protected double maxheight;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animal(String type, String name,int maxlength,int maxdistance,double maxheight ) {
        this.type = type;
        this.name = name;
        this.maxlength = maxlength;
        this.maxdistance=maxdistance;
        this.maxheight=maxheight;
    }

    public boolean run(int length, int maxlength) {

        if (length <= maxlength) {
//            System.out.println(type + " " + name + " бежит " + length + " метров.");
            return true;
        } else {
//            System.out.println(type + " " + " не может пробежать более " + maxlength + " метров.");
            return false;
        }
    }

    public void swim(int distance) {
        System.out.println(type + " " + name + " проплывает " + distance + " метров.");
    }

    public void jump(double height, double maxheight) {
        if (height <= maxheight) {
            System.out.println(type + " " + name + " перепрыгивает через препятствие " + height + " метров.");
        } else {
            System.out.println(type + " " + " не может подпрыгнуть выше " + maxheight + " метров.");
        }
    }
}
