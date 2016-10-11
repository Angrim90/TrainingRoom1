package net.ukr.oleg90.shvets.goods;

/**
 * @author Shvets Oleg
 * @version 1.0
 */
public class GoodsExt extends Goods {

    private String type;

    public GoodsExt(double price, double size, double weight, String description, String adress, int expiryDate,String type) {
        super(price, size, weight, description, adress, expiryDate);
        this.type=type;
    }

    public GoodsExt(double price, double size, double weight, String description, String adress, int expiryDate) {
        super(price, size, weight, description, adress, expiryDate);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "GoodsExt{" +
                "type='" + type + '\'' + super.toString()+
                '}';
    }
}
