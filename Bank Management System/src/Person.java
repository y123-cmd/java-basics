public abstract class Person {
    private String name;
    private int age;

    public String  getName() {
        return name;
    }
    public void setName(String name) {
        if(name == null || name.isEmpty() || name.length() < 2) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void displayInfo(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public abstract void displayRole();
}
