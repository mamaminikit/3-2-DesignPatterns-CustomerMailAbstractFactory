/* Kitthanya Teachanontkullawat (Mine) 64050027 */
import java.util.Scanner;
public class CustomerApplication {
    public static String getCustomerTypeFromUser() {
        String customerType = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                customerType = "Regular";
                break;
            case 2:
                customerType = "Mountain";
                break;
            case 3:
                customerType = "Delinquent";
                break;
        }
        inp.close();
        return customerType;
    }

    public static void startContact(IMail mail, IBrochure brochure) {
        mail.sendTheMail();
        brochure.sentTheBrochure();
    }
    
    public static void main(String[] args) {
        String customerType = getCustomerTypeFromUser();
        IContact factory = CustomerFactory.createCustomer(customerType);
        IMail mail = factory.createMail();
        IBrochure brochure = factory.createBrochure();
        startContact(mail, brochure);
    }
}
