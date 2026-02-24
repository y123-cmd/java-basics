public abstract class Shape {
    private String color;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        if(color==null || color.isEmpty()){
            throw new IllegalArgumentException("color cannot be empty");
        }
        this.color = color;
    }

    public Shape(String color) {
        setColor(color);
    }

    public abstract double calculateArea();

    public void color(){
        System.out.println("color is " + color);
    }
    public void displayInfo(){
        System.out.println("this is a  " + color + " shape ");
    }
}
