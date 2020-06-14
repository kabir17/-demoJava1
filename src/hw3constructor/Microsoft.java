package hw3constructor;

/*multiple constructors,static & non-static variables and methods.You need to show the uses of
 for,while and do...while loop.Show the uses of if….else,OR,&& operator of truth table.
*/
public class Microsoft {

    static String shareMarketName = "Rabinhood.com";
    String shareName,buyerName;
    int totalShare;
    double shareCost;
    boolean isGood;
    char shareCategory;

    public Microsoft(){}
    public Microsoft(String buyerName,String shareName){
        this.buyerName = buyerName;
        this.shareName= shareName;
    }
    public Microsoft(String buyerName,String shareName,int totalShare,double shareCost){
        this.buyerName = buyerName;
        this.shareName= shareName;
        this.totalShare = totalShare;
        this.shareCost = shareCost;
    }
    public Microsoft(String buyerName,String shareName,int totalShare, double shareCost,
                     boolean isGood,char shareCategory){
        this.buyerName = buyerName;
        this.shareName= shareName;
        this.totalShare = totalShare;
        this.shareCost = shareCost;
        this.isGood = isGood;
        this.shareCategory = shareCategory;
    }

    public void brandShare(){
        int i = 0;
        do {
            System.out.println("Microsoft brand");
            i++;
        }while (i<3);
    }
    public static void addShare(int a, int b){
        System.out.println("Add share : "+(a+b));
    }
    public int gainShareCost(int num1,int num2){
        int total = num1 * num2;
        return total;
    }
    public int totalShareCost(int num1,int num2){
        return num1 * num2;  //return as multiply.
    }
    public String valueString(){
        System.out.println("hi Microsoft");
        return "Bye Apple";
    }
    public boolean valueBoolean(){
        return false;
    }
    public boolean isExpensive(int share){
        if(share >=15 || share <=20)
        return true;
        else {
            return false;
        }
    }
}
