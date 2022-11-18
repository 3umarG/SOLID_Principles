package dependency_inversion;

// Create interface/abstract class to be mutual between my two classes
// عشان اقدر اشيل الاعتمادية بين ال two classes وبين بعضهم
// الكوع
public interface DeliveryService {

    public void deliverProduct(Product product);
}
