interface Computer{
    void code();
}

class Laptop implements  Computer{
    public void code(){
        System.out.println("code, compile, run");
    }
}
class Desktop implements Computer {
    public void code(){
        System.out.println("code, compile, run : faster");
    }
}
class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}
public class Demo {
    public static void main(String[] args) {
        Computer desk = new Desktop();
        Developer developer = new Developer();
        Computer lap  = new Laptop(); // interface reference
        developer.devApp(lap);
        developer.devApp(desk);

    }
}
