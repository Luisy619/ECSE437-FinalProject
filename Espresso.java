public class Espresso implements Coffee {
    @Override
    public void name() {
        System.out.println("Espresso");
    }

    @Override
    public void recipe() {
        System.out.println("Brew groud coffee bean of your choice!");
    }

    @Override
    public void price() {
        System.out.println("4.99");
    }
}
