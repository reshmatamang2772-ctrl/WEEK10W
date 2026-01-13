package Q5;


/**
 * Write a description of class Order here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Order{
    private int orderid;
    String customername;
    double amount;
   
    public Order(int orderid, String customername, double amount){
        this.orderid = orderid;
        this.customername = customername;
        this.amount = amount;
       
    }
   
    public void setOrderid(int NewId){
        this.orderid = NewId;
       
       
    }
   
    public int getOrderid(){
        return this.orderid;
       
    }
   
    public void setcustomername(String NewName){
        this.customername = NewName;
       
       
    }
   
    public String getcustomername(){
        return this.customername;
       
    }
   
    public void setamount(double NewAmount){
        this.amount = NewAmount;
       
       
    }
   
    public double getamount(){
        return this.amount;
    }
   
    public double Getdiscount(){
        return 500;
       
    }
    public double calculatefinalamount(){
        return amount - Getdiscount();
       
    }
   
    @Override
    public String toString(){
        return "OrderID: "+ orderid +
        " Customer_Name: " + customername +
        " Amount: " + amount;
       
    }
   
   
   
}
