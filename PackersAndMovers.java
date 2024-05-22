import java.util.*;
class PackersAndMovers{
    private int invoiceNo;
    private String fromCity;
    private String toCity;
    private String orderDate;
    private  String deliveryDate;
    private double price;
    public void setinvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
      }
    
      // initialize name
      public void setfromCity(String fromCity) {
        this.fromCity = fromCity;
      }
      public void settoCity(String toCity) {
        this.toCity = toCity;
      }
      public void setorderDate(String orderDate) {
        this.orderDate = orderDate;
      }
      public void setdeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
      }
      public void setpice(double price) {
        this.price = price;
      }
    
      // access age
      public int getinvoiceNo() {
        return this.invoiceNo;
      }
    
      // access name
      public String getfromCity() {
        return this.fromCity;
      }
      public String gettoCity() {
        return this.toCity;
      }
      public String getorderDate() {
        return this.orderDate;
      }
      public String getdeliveryDate() {
        return this.deliveryDate;
      }
      public double getprice() {
        return this.price;
      }
}

