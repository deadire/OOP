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

    public boolean Intersection (Rectangle rectangle1, Rectangle rectangle2){
        if (rectangle1.getTopLeftCorner().getX() > rectangle2.getTopLeftCorner().getX() && rectangle1.getTopLeftCorner().getX() < rectangle2.getTopLeftCorner().getX() + rectangle2.getLength()){
            return true;
        } else {
            return false;
        }
    }
}
