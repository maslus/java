package lesson6.HomeClass06;

public class Cat extends Animal {

    public Cat() {
        super();
        type = "Cat";
    }

    public Cat(String name) {
        super(name);
        type = "Cat";
    }

    @Override
    public boolean run(int length, int maxlength) {
        if (length <= maxlength) {
//            System.out.println(type + " " + name + " бежит " + length + " метров.");
            return true;
        } else {
//            System.out.println(type + " " + " не может пробежать более " + maxlength + " метров.");
            return false;
        }
    }

    @Override
    public void jump (double height, double maxheight){
        if (height <= maxheight) {
            System.out.println(type + " " + name + " перепрыгивает через препятствие " + height + " метров.");
        } else {
            System.out.println(type + " " + " не может подпрыгнуть выше " + maxheight + " метров.");
        }
    }

    @Override
    public void swim (int distance) {
        System.out.println("Ни один " + type + " не умеет плавать.");
    }
}