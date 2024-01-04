/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class CustomerFactory {
    public static IContact createCustomer(String type) {
        switch(type) {
            case "Regular":
                return RegularCustomerFactory.getRegularFactory();
            case "Mountain":
                return MountainCustomerFactory.getMountainFactory();
            case "Delinquent":
                return DelinquentCustomerFactory.getDelinquentFactory();
        }
        return null;
    }
}
