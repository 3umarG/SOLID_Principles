package open_closed.guitars;

public class FlameGuitar extends Guitar {
    // TODO : I Solved the problem of modification
    // TODO : By creating new FlameGuitar that has the same attributes of the Guitar
    // TODO : ... and also has some unique attributes like flameColor and flameModel ...
    private String flameModel;
    private String flameColor;

    public FlameGuitar(String model, String id, double price, String flameModel, String flameColor) {
        super(model, id, price);
        this.flameModel = flameModel;
        this.flameColor = flameColor;
    }

    public String getFlameModel() {
        return flameModel;
    }

    public void setFlameModel(String flameModel) {
        this.flameModel = flameModel;
    }

    public String getFlameColor() {
        return flameColor;
    }

    public void setFlameColor(String flameColor) {
        this.flameColor = flameColor;
    }
}
