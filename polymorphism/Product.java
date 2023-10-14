package polymorphism;

public class Product {
    public Product(){
    }

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    protected String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String desc(){
        String description = "品名："+name+"\r\n價錢："+price;
        return  description;
    }
}
