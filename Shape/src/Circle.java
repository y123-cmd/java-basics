public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public Circle(double radius, String color) {
        super(color);
        setRadius(radius);
    }
}
