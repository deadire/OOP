import java.awt.geom.Area;

public class Sphere extends Shape3D implements Drawable {
    private double radius;

    Sphere(String name, double radius){
        super(name);
        this.radius = radius;
    }

    public double Volume (){
        return Math.PI * 4/3 * radius * radius * radius;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                '}';
    }
    public void draw(){
        System.out.println("Drawing Sphere");
    }
}
