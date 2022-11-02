package single_responsibilty;

public class EmployeeService {
    // This Class Violate Single Responsibility Principle "S.R.P"
    // Why ???
    // Because this Class has more than one reason to modify on it ...
    // EmployeeService should only have methods that response to employee ONLY
    // But Function Send is another reason to modify this class ...
    // And it's not one of the main functions of Employee Service

    // SOLUTION : put every method in separate Class and use it when needs ...
    EmailService emailService = new EmailService();


    public void employeeRegistration(int empId) {
        // TODO : Add Employee
        // ...
        // Do All Works , then send email to employee ..
        emailService.sendEmail();


        // Now you have only one reason to modify this class
        // and the function of send email is encapsulated into separated class to reuse ...
    }

    public void employeeDiscountRate(String empPosition) {
        // TODO : Calculate Employee Discount Rate based on his Position
    }

}
