/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class RegularCustomerFactory implements IContact{
    private static RegularCustomerFactory factory = new RegularCustomerFactory();
    private RegularCustomerFactory() {

    }

    public static RegularCustomerFactory getRegularFactory() {
        return factory;
    }

    @Override
    public IBrochure createBrochure() {
        return new RegularBrochure();
    }

    @Override
    public IMail createMail() {
        return new RegularMail();
    }
}
