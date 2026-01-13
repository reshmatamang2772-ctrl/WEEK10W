package Q5;


/**
 * Write a description of class NormalOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NormalOrder extends Order{
    public NormalOrder(int orderid, String customername, double amount){
        super(orderid, customername, amount);
       
       
    }
   
    @Override
    public double calculatefinalamount(){
        return super.calculatefinalamount();
       
       
       
    }
}