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
   
    public void setorderid(int newid){
        this.orderid = newid;
       
       
    }
   
    public int getorderid(){
        return this.orderid;
       
    }
   
    public void setcustomername(String newname){
        this.customername = newname;
       
       
    }
   
    public String getcustomername(){
        return this.customername;
       
    }
   
    public void setamount(double newamount){
        this.amount = newamount;
       
       
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
