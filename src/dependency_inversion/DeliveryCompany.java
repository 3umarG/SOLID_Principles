package dependency_inversion;

public class DeliveryCompany {

    public void sendProduct(Product product){
        DeliveryDriver driver = new DeliveryDriver();
        driver.deliverProduct(product);
    }
}
