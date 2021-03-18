public class CustomerManager implements ICustomerDal {
    ICustomerDal customerDal;

    public void add() {

        customerDal.add();
    }
}
