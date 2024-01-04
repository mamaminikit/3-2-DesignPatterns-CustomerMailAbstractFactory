/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class MountainCustomerFactory implements IContact {
    private static MountainCustomerFactory factory = new MountainCustomerFactory();
    private MountainCustomerFactory() {

    }

    public static MountainCustomerFactory getMountainFactory() {
        return factory;
    }

    @Override
    public IBrochure createBrochure() {
        return new MountainBrochure();
    }

    @Override
    public IMail createMail() {
        return new MountainMail();
    }
}
