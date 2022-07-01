public class Shape {
    private boolean isFilled;
    private String color;

    public Shape() {
        this.isFilled = true;
        this.color = "Green";
    }

    public Shape(boolean isFilled, String color) {
        this.isFilled = isFilled;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Filled: %b\nColor: %s", this.isFilled, this.color);
    }

}


