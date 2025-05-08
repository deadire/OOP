public abstract class Shape2D extends Shape {

    public boolean isFilled;

    Shape2D(String name){
        super(name);
    }

    public abstract double Area();

}
