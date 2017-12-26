package IPR_1;

/**
 * Created by shukhovvg on 26.12.2017.
 */
public class Stock {

    private String name;
    private double price;
    private int stock;

    public Stock(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    private Stock() {}

    public void printProductName() {
        System.out.println("Product name: " + name);
    }

    public void printProducrPrice() {
        System.out.println("Product price: " + price);
    }

    public void printProducrSrock() {
        System.out.println("Product stock: " + stock);
    }
}
