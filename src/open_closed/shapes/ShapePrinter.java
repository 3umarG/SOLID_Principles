package open_closed.shapes;


public class ShapePrinter {
    public void draw(Object shape) {
        if (shape instanceof Rectangle) {
            System.out.println(((Rectangle) shape).getHeight() * ((Rectangle) shape).getWidth());
        } else if (shape instanceof Square) {
            System.out.println(((Square) shape).getSide() * ((Square) shape).getSide());
        }
        // TODO: the problem is here
        // TODO: if i add any new shape ,
        // TODO: i have to modify this class in this function to add the specific behaviour of that class "shape"

    }
}
