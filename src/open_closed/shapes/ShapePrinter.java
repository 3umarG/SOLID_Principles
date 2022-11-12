package open_closed.shapes;


public class ShapePrinter {
    // TODO: I use Polymorphism with abstraction to hide the mechanism of draw function ..
    // TODO: .. for every shape and when adding new shape i don't have to modify this class ..
    // TODO: all i will do is to extends the abstract class from the new shape class .
    public void draw(Shape shape) {
       shape.draw();
    }
}
