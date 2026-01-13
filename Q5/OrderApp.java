package Q5;


/**
 * Write a description of class OrderApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderApp{
    
    public static void main(String args[]){
        //for normal orders;;;
        NormalOrder no = new NormalOrder(121, "Sarang", 4700);
       
        System.out.println("----Total Orders----");
        System.out.println(no);
        System.out.println("Final Amount: " + no.calculatefinalamount());
       
        //for Premium orders;;
       
        System.out.println();
        PremiumOrder po = new PremiumOrder(111, "wongmo", 12000);
       
        System.out.println(po);
        System.out.println("Final Amount: " + po.calculatefinalamount());
       
        System.out.println("----Done----");
       
       
       
    }
}

