/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class DelinquentCustomerFactory implements IContact {
    private static DelinquentCustomerFactory factory = new DelinquentCustomerFactory();
    private DelinquentCustomerFactory() {

    }

    public static DelinquentCustomerFactory getDelinquentFactory() {
        return factory;
    }

    @Override
    public IBrochure createBrochure() {
        return new DelinquentBrochure();
    }

    @Override
    public IMail createMail() {
        return new DelinquentMail();
    }
}
