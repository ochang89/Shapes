public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        this.width = 1;
        this.length = 2;
        setLW(width, length);
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
        setLW(width, length);
    }
    public Rectangle(double width, double length, boolean isFilled, String color){
        super(isFilled, color);
        this.width = width;
        this.length = length;
        setLW(width, length);
    }
    public void setLW(double x, double y){
        if(x > y){
           this.length = x;
           this.width = y;
        }
        else {
            this.length = y;
            this.width = x;
        }
    }
    public double getArea(){
        return this.width*this.length;
    }
    public String toString(){
        return String.format("Width: %.1f\nLength: %.1f\nArea: %.1f\n%s", this.width, this.length, this.getArea(), super.toString());
    }
}
