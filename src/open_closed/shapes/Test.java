package open_closed.shapes;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();
        shapes.add(new Circle(3));
        shapes.add(new Rectangle(2,4));
        shapes.add(new Square(5));

        for(Shape shape : shapes){
            shape.draw();
            // This is Bad Solution and
//            if (shape instanceof Circle){
//                // ........
//            }else if (shape instanceof Rectangle){
//                //......
//            }else if (shape instanceof Square){
//                // ........
//            }
        }
    }
}
