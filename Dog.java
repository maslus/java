package lesson6.HomeClass06;

public class Dog extends Animal {

    public Dog(){
        super();
        type = "Dog";
    }

    public Dog(String name) {
        super(name);
        type="Dog";
    }

    public Dog(String name, int maxlength) {
        super(name);
        type = "Dog";
        this.maxlength = maxlength;
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
    public void jump (double height,double maxheight){
        if (height <= maxheight) {
            System.out.println(type + " " + name + " перепрыгивает через препятствие " + height + " метров.");
        } else {
            System.out.println(type + " " + " не может подпрыгнуть выше " + maxheight + " метров.");
        }
    }

    @Override
    public void swim (int distance){
        int maxdistance = 10;
        if (distance <= maxdistance) {
            System.out.println(type + " " + name + " проплывает " + distance + " метров.");
        } else {
            System.out.println(type + " " + " не может проплыть более " + maxdistance + " метров.");
        }
    }
}
