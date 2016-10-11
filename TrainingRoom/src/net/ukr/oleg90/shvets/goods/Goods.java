package net.ukr.oleg90.shvets.goods;

/**
 * @author Shvets Oleg
 * @version 1.0
 */
public class Goods implements Selling, Delivery, SanitaryStation {
    private double price;
    private double size;
    private double weight;
    private String description;
    private String adress;
    private int expiryDate;
    public Goods(double price, double size, double weight, String description, String adress,
                 int expiryDate) {
        this.price = price;
        this.size = size;
        this.weight = weight;
        this.description = description;
        this.adress = adress;
        this.expiryDate = expiryDate;
    }
    public double getPrice() { return price; }
    public void setPrice(double price) {this.price = price; }
    public double getSize() { return size;}
    public void setSize(double size) {this.size = size; }
    public double getWeight() {return weight;}
    public void setWeight(double weight) {this.weight = weight; }
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public String getAdress() { return adress;}
    public void setAdress(String adress) {this.adress = adress;}
    public int getExpiryDate() { return expiryDate; }
    public void setExpiryDate(int expiryDate) {this.expiryDate = expiryDate; }
}