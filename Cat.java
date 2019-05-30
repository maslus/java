package lesson7.cats;

public class Cat {
    private String name;
    private int hunger;


//    public Cat(String name) {
//        this.name = name;
//    }
    
    public Cat(String name, int hunger) {
        this.name = name;
        this.hunger = hunger;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= hunger) {
            plate.decreaseFood(hunger);
            hunger = 0;
            System.out.println(name + " eat...");
        } else {
            System.out.println("В тарелке недостаточно корма для " + name);
        }
    }

    public boolean satiety(Cat cat) {
        if (cat.hunger > 0) {
            return false;
        } else {
            return true;
        }
    }

//    public void fear(Dog dog) {
//        System.out.println(name + " fear..." + dog.getName());
//    }

}
