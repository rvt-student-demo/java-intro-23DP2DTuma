package lv.rvt;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String iinitialName, double initialPrice, int initialQuantity) {
        this.name = iinitialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }
    public void printProduct() {
        System.out.println(this.name + ", price" + this.price + "," + this.quantity + " pcs");
    }
}
