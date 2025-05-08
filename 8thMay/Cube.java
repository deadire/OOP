public class Cube extends Shape3D implements Drawable {
    private double side;

    Cube(double side, String name) {
        super(name);
        this.side = side;
    }

    @Override
    public double Volume() {
        return side * side * side;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                '}';
    }
    public void draw(){
        System.out.println("Drawing Cube");
    }
}
