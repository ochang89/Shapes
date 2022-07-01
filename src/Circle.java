public class Circle extends Shape{
    private double radius;

    public Circle(){
        this.radius = 1;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, boolean isFilled, String color){
        super(isFilled, color);
        this.radius = radius;

    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public String toString(){
        return String.format("Radius: %f\nArea: %f\n%s", this.radius, this.getArea(), super.toString());
    }

}

