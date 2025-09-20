package JavaImplementation;

public class Product {

    private int id;

    private int price;

    public Product(int id, int price){
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public int getPrice() {
        return price;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setPrice(int price){
        this.price = price;
    }

    @Override
    public String toString(){
        return "Product{id = " + id + ", price = " + price + "}";
    }
}
