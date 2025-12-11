package main;

public class Pet {
    private String name;
    private int age;
    private String type;

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getType(){
        return type;
    }
    public void setName(String name){
         this.name = name;
    }
    public void setAge(int age){
         this.age = age;
    }
    public void setType(String type){
        this.type = type;
    }

    void eat() {
        System.out.println(name + "is eating");
    }

    void sleep() {
        System.out.println(name + "is sleeping");
    }

    void makesound() {
        System.out.println("makesound");
    }
}
class Dog extends Pet {
    @Override
    void makesound() {
        System.out.println("woof woof!");
    }
}
    class Cat extends Pet {
        @Override
        void makesound() {
            System.out.println("meow meow!");
        }
    }
class PetManager {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.setName("buddy");
        myDog.setAge(3);
        myDog.setType("Dog");
        myDog.eat();
        myDog.sleep();
        myDog.makesound();
        System.out.println(myDog.getName() + "is a" + myDog.getType() + "and is" + myDog.getAge() + "years old");

        Cat myCat = new Cat();
        myCat.setName("kitty");
        myCat.setAge(2);
        myCat.setType("cat");
        myCat.eat();
        myCat.sleep();
        myCat.makesound();
        System.out.println(myCat.getName() + "is a " + myCat.getType() + "and is" + myCat.getAge()+ "years old");
    }
}








