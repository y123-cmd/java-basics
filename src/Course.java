public abstract class Course {
    private String courseId;
    private String courseName;
    private double price;

    public String getCourseId() {m
        return courseId;
    }

    public void setCourseId(String courseId) {
        if(!courseId.startsWith("C") || courseId.length()!= 6){
            throw new IllegalArgumentException("Invalid course id");
        }
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if(price < 0){
            throw new IllegalArgumentException("Invalid price");
        }
        this.price = price;
    }
     public  abstract void startCourse();

}
