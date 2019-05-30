package lesson5;

public class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String name,String position,String email, String phone,int salary,int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {

        info("Ivanova Darya", "receptionist", "ivanova@java.ru", "89099898781", 40000, 26);

        Person[] persArray = new Person[5];
        persArray[0]= new Person("Kotov Oleg", "manager", "kotov@java.ru", "89876543210", 100000, 41);
        persArray[1]= new Person("Somova Zina", "accountant", "somova@java.ru","89999999999", 75000, 36);
        persArray[2]= new Person("Durov Ivan","engineer","durov@java.ru", "89098765432", 90000, 29);
        persArray[3]= new Person("Kim Karina", "trainee", "kim@java.ru", "89999098765", 15000, 21);
        persArray[4]= new Person("Zueva Anna", "director", "Zueva@java.ru","89879879876", 200000,46);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age>40){
                System.out.println("ФИО: " + persArray[i].name + " Должность: "+ persArray[i].position + " email: " + persArray[i].email+ " Тел.: " + persArray[i].phone + " Зарплата: "+ persArray[i].salary + " Возраст: "+ persArray[i].age);
            }
        }
    }

    public static void info(String name,String position,String email, String phone,int salary,int age){
        System.out.println("ФИО: " + name + " Должность: "+ position + " email: " + email+ " Тел.: " + phone + " Зарплата: "+ salary + " Возраст: "+ age);
        System.out.println();
    }
}
