package dependency_inversion;

public class DeliveryCompany {

    public void sendProduct(Product product){
        /*
        * This Structure VIOLATE the Dependency Inversion Principle.
        * Because The "DeliveryCompany Class" depends on "DeliveryDriver Class".
        *
        *
        * VIOLATION !!! VIOLATION !!! VIOLATION !!! VIOLATION !!!
         */
        DeliveryDriver driver = new DeliveryDriver();
        driver.deliverProduct(product);
    }
}
