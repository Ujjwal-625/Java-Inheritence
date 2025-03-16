package MultiLevelinheritence;


class Order{
    String OrderId,OrderDate;
    Order(String OrderId,String OrderDate){
        this.OrderDate=OrderDate;
        this.OrderId=OrderId;
    }
    void getDetails(){
        System.out.println("Order Id : "+OrderId);
        System.out.println("Order Date : "+OrderDate);
    }
}

class ShippedOrder extends Order{
    String trackingNumber;
    ShippedOrder(String OrderId,String OrderDate,String trackingNumber){
        super(OrderId,OrderDate);
        this.trackingNumber=trackingNumber;
    }

    void getDetails(){
        System.out.println("Order Id : "+OrderId);
        System.out.println("Order Date : "+OrderDate);
        System.out.println("Order tracking Number : "+trackingNumber);
    }
}

class DeliverdOrder extends ShippedOrder{
    String DeliveryDate;
    DeliverdOrder(String OrderId,String OrderDate,String trackingNumber,String DeliveryDate){
        super(OrderId,OrderDate,trackingNumber);
        this.DeliveryDate=DeliveryDate;
    }
    void getDetails(){
        System.out.println("Order Id : "+OrderId);
        System.out.println("Order Date : "+OrderDate);
        System.out.println("Order tracking Number : "+trackingNumber);
        System.out.println("Order Delivery Date : "+DeliveryDate);
    }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        DeliverdOrder o=new DeliverdOrder("id897","3 Mar 2025","78u098","10 Mar 2025");
        o.getDetails();

    }
}
