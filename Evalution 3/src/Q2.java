abstract class Order{
    int id;
    abstract void accept();
    abstract void display();
}
class Purchase extends  Order{
    String customerName;
    public void accept(){
        String customerName = "Rams";
    }
    public void display(){
        System.out.println(customerName);
    }

}
class SalesOrder extends Order{
    String vendorName;
    public void accept(){
        String vendorName = "Vikas";
    }
    public void display(){
        System.out.println(vendorName);
    }
}
public class Q2 {
    public static void main(String[] args) {
        Order order = new SalesOrder();
        order.display();



    }
}
