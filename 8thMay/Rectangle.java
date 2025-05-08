public class Rectangle extends Shape2D implements Drawable {
    private double length;
    private double width;
    private Point TopLeftCorner;

    Rectangle (String name, double length,double width){
        super(name);
        this.length=length;
        this.width=width;
    }


    public void setTopLeftCorner(Point TopLeftCorner){
        this.TopLeftCorner=TopLeftCorner;
    }

    public Point getTopLeftCorner(){
        return TopLeftCorner;
    }

    Rectangle(String name) {
        super(name);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double Area() {
        return length * width;
    }
    public double getPerimeter() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
    public void draw(){
        System.out.println("Drawing Rectangle");
    }
}
