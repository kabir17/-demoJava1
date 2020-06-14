package hw3constructor;

public class Apple {
    static String shareMarketName = "Rabinhood.com";
    static String place = "USA";
    String buyerName;
    String shareName;
    int totalShare;
    double shareCost;
    boolean isGood;
    char shareCategory;

    public Apple(){
    }
    public Apple(String buyerName,String shareName){
        this.buyerName= buyerName;
        this.shareName= shareName;
    }
    public Apple(String buyerName,String shareName,int totalShare,double shareCost){
        this.buyerName= buyerName;
        this.shareName= shareName;
        this.totalShare = totalShare;
        this.shareCost = shareCost;
    }
    public Apple(String buyerName,String shareName,int totalShare, double shareCost,boolean isGood,char shareCategory){
        this.buyerName=buyerName;
        this.shareName= shareName;
        this.totalShare = totalShare;
        this.shareCost = shareCost;
        this.isGood = isGood;
        this.shareCategory = shareCategory;
    }
    public void brandShare(){
        int i=0;
        while (i<3){
            System.out.println("Apple brand");
            i++;
        }
    }
    public static void deductShare(int a, int b){
        System.out.println(a-b);
    }
    public int lostShareCost(int num1,int num2){
        int total = num1 * num2;
        return total;
    }
    public int totalShareCost(int num1,int num2){
        return num1 * num2;
    }
    public static String valueString(){
        System.out.println("hi Apple");
        return "Bye Microsoft";
    }
    public boolean valueBoolean(){
        return false;
    }
    public boolean isExpensive(int share) {
        if (share >= 15 && share <= 20)
            return true;
        else {
            return false;
        }
    }
}
