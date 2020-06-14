package hw3constructor;

public class RabinHoodRunner {
    public static void main(String[] args) {

        Microsoft mObj = new Microsoft("kajol","Microsoft",100,
                5000.00,true,'B');

        System.out.println(Microsoft.shareMarketName);
        Microsoft.addShare(200,200);

        mObj.brandShare();
        System.out.println("Microsoft share up : "+mObj.gainShareCost(10,10));
        System.out.println(mObj.buyerName);
        System.out.println(mObj.shareName);
        System.out.println(mObj.totalShare);
        System.out.println(mObj.shareCost);
        System.out.println(mObj.isGood);
        System.out.println(mObj.shareCategory);
        System.out.println("Share gain cost : "+mObj.gainShareCost(10,10));
        System.out.println("Total share cost : "+mObj.totalShareCost(50,100)+" "+"dollars");
        System.out.println(mObj.isExpensive(14));

        System.out.println("------------------- ");

        Apple aObj = new Apple("Mafi","Apple",100,10000.00, true, 'B');

        System.out.println(Apple.shareMarketName);
        System.out.println(Apple.place);
        Apple.deductShare(100,30);

        aObj.brandShare();
        System.out.println("Share name : "+aObj.shareName);
        System.out.println(aObj.shareCost);
        System.out.println(aObj.totalShare);
        System.out.println(aObj.shareCategory);
        System.out.println(aObj.isGood);
        System.out.println(aObj.lostShareCost(20,20));
        System.out.println(aObj.totalShareCost(20,600));
        System.out.println(aObj.valueString());
        System.out.println(aObj.valueBoolean());
        System.out.println(aObj.isExpensive(19));
    }
}
