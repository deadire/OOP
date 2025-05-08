public class ShapeUtil {

    ShapeUtil(){}

    public void displayShapes(Shape[] shapes){
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public void IncreaseRectangleLength(Rectangle target, int length){
        target.setLength(length + target.getLength());
    }

    public boolean intersects(Rectangle r1, Rectangle r2) {
        double r1Left = r1.getTopLeftCorner().getX();
        double r1Right = r1Left + r1.getWidth();
        double r1Top = r1.getTopLeftCorner().getY();
        double r1Bottom = r1Top - r1.getLength();

        double r2Left = r2.getTopLeftCorner().getX();
        double r2Right = r2Left + r2.getWidth();
        double r2Top = r2.getTopLeftCorner().getY();
        double r2Bottom = r2Top - r2.getLength();

        if (r1Left >= r2Right || r1Right <= r2Left || r1Top <= r2Bottom || r1Bottom >= r2Top) {
            return false;
        }
        return true;
    }

}
