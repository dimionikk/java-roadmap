public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Circle(11),
                new Square(7),
        };
        for (Shape shape : shapes) {
            System.out.println(area(shape));
        }
    }

    static double area(Shape shape) {
        return switch (shape) {
            case Circle circle -> Math.PI * circle.radius() * circle.radius();
            case Rectangle rectangle -> rectangle.width() * rectangle.height();
            case Square square -> square.side()*square.side();
        };
    }
}