package polymorphism;

public class Notebook extends Product {
    public Notebook(String name, int price, int warranty) {
        super(name,price);
        this.warranty = warranty;
    }

    private int warranty;

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public String desc() {
        String description = super.desc();
        description = description + "\n保固："+warranty+"天";
        return description;
    }
}
