package net.ukr.oleg90.shvets.goods;

/**
 * @author Shvets Oleg
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
    Goods corn = new Goods(20, 20, 300, "fresh corn", "Kiev", 2016);
        GoodsExt goodsExt = new GoodsExt(30,30,400,"fresh fish","Cherkassy",2016,"fish");

        doJob(corn);
        doJob(goodsExt);


    }
    public static void doJob(Goods g){
        Manager m = new Manager("Danil", 23, "Novice");

        m.raisePrice(g, 15);

        System.out.println(g.getPrice());

        DeliveryMan dm = new DeliveryMan("Igor", 35);
        DeliveryMaster master = new DeliveryMaster("John",27);
        dm.delivered(g);
        master.delivered(g);

        SanStation ss1 = new SanStation("KIEV SES");
        ss1.check(g);
    }
}
