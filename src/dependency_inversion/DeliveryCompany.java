package dependency_inversion;

public class DeliveryCompany {

    // Polymorphism
    DeliveryService deliveryService;

    // Dependency injection in Constructor.
    public DeliveryCompany(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public void sendProduct(Product product) {
        /*
         * Now I solve the problem of dependency by adding an interface.
         * All these classes are depended on this interface.
         * العامل المشترك بينهم "الكـــــوع"
         */

        // Bad Code
//        DeliveryDriver deliveryDriver = new DeliveryDriver();
//        deliveryDriver.deliverProduct(product);

        this.deliveryService.deliverProduct(product);
    }
}
