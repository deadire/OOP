public class main {
    public static void main(String[] args) {
        Shape shape1;
        Shape2D shape2;
        Shape3D shape3;
        Circle circle1 = new Circle("circle1",24);
        circle1.setRadius(2);
        System.out.println("Area of Circle is: " + circle1.Area());
        Rectangle rectangle1 = new Rectangle("rectangle1",24,24);
        rectangle1.setLength(2);
        rectangle1.setWidth(2);
        rectangle1.setTopLeftCorner(new Point(10,10));
        System.out.println("Area of Rectangle is: " + rectangle1.Area());
        Rectangle rectangle2 = new Rectangle("rectangle2",24,24);
        rectangle1.setLength(4);
        rectangle1.setWidth(4);
        rectangle1.setTopLeftCorner(new Point(20,20));
        System.out.println("Area of Rectangle is: " + rectangle2.Area());
        Shape[] shapes = new Shape[20];
        shapes[0] = circle1;
        shapes[1] = rectangle1;
        shapes[2] = circle1;
        shapes[3] = rectangle1;
        shapes[4] = circle1;
        shapes[5] = rectangle1;
        shapes[6] = circle1;
        shapes[7] = rectangle1;
        shapes[8] = circle1;
        shapes[9] = rectangle1;
        shapes[10] = circle1;
        shapes[11] = rectangle1;
        shapes[12] = circle1;
        shapes[13] = rectangle1;
        shapes[14] = circle1;
        shapes[15] = rectangle1;
        shapes[16] = circle1;
        shapes[17] = rectangle1;
        shapes[18] = circle1;
        shapes[19] = rectangle1;
        ShapeUtil shapeUtil = new ShapeUtil();
        System.out.println("Shapes are:");
        shapeUtil.displayShapes(shapes);
    }
}