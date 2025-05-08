public class main {
    public static void main(String[] args) {
        Shape shape1;
        Shape2D shape2;
        Shape3D shape3;

        Circle circle1 = new Circle("circle1", 24);
        circle1.setRadius(2);
        System.out.println("Area of Circle is: " + circle1.Area());

        Rectangle rectangle1 = new Rectangle("rectangle1", 24, 24);
        rectangle1.setLength(2);
        rectangle1.setWidth(2);
        rectangle1.setTopLeftCorner(new Point(10, 10));
        System.out.println("Area of Rectangle 1 is: " + rectangle1.Area());

        Rectangle rectangle2 = new Rectangle("rectangle2", 24, 24);
        rectangle2.setLength(4);
        rectangle2.setWidth(4);
        rectangle2.setTopLeftCorner(new Point(20, 20));
        System.out.println("Area of Rectangle 2 is: " + rectangle2.Area());
        
        if (intersects(rectangle1, rectangle2)) {
            System.out.println("Rectangles intersect.");
        } else {
            System.out.println("Rectangles do NOT intersect.");
        }

        Shape[] shapes = new Shape[20];
        for (int i = 0; i < 20; i++) {
            shapes[i] = (i % 2 == 0) ? circle1 : rectangle1;
        }

        ShapeUtil shapeUtil = new ShapeUtil();
        System.out.println("Shapes are:");
        shapeUtil.displayShapes(shapes);
    }

    public static boolean intersects(Rectangle r1, Rectangle r2) {
        double r1Left = r1.getTopLeftCorner().getX();
        double r1Right = r1Left + r1.getWidth();
        double r1Top = r1.getTopLeftCorner().getY();
        double r1Bottom = r1Top + r1.getLength();

        double r2Left = r2.getTopLeftCorner().getX();
        double r2Right = r2Left + r2.getWidth();
        double r2Top = r2.getTopLeftCorner().getY();
        double r2Bottom = r2Top + r2.getLength();

        return !(r1Left >= r2Right || r1Right <= r2Left || r1Top >= r2Bottom || r1Bottom <= r2Top);
    }
}
