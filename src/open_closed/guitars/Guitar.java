package open_closed.guitars;

public class Guitar {
    private String model;
    private String id;
    private double price;
    // TODO: I want to add a new Property is the guitar with flame ..
    // TODO: OKAY !!
    // TODO: but with this way i will modify this class and change its constructor
    // TODO: OOPS !! I violate the Open Closed Principle ..

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Guitar(String model, String id, double price) {
        this.model = model;
        this.id = id;
        this.price = price;
    }
}
