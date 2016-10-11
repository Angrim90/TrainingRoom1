package net.ukr.oleg90.shvets.goods;

/**
 * @author Shvets Oleg
 * @version 1.0
 */
public interface Delivery {
    public double getSize();
    public void setSize(double size);
    public double getWeight();
    public void setWeight(double weight);
    public String getAdress();
    public void setAdress(String adress);
}