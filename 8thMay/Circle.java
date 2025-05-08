import java.awt.geom.Area;

public class Circle extends Shape2D implements Drawable {
    private double radius;
    private Point center = new Point(0,0);

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double Area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
    public void draw(){
        System.out.println("Drawing Circle");
    }
}
