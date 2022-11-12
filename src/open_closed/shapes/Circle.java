package open_closed.shapes;

public class Circle extends Shape {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println(Math.PI * this.r * this.r);
    }
}
