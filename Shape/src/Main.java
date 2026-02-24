//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red");
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Blue");
        Shape[] s = {circle, rectangle};

        Shape[] shapes = {
                new Circle(5.0, "Red"),
                new Rectangle(4.0, 6.0, "Blue"),
        };
        for (Shape shape : shapes) {
            shape.displayInfo();

            System.out.println("area : " + shape.calculateArea());
        }
    }
}
