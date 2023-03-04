package OOP;

public class InvoiceItem {
    String id;
    String desc;
    int qty;
    double uniPrice;

    public InvoiceItem(String id, String desc, int qty, double uniPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.uniPrice = uniPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getUniPrice() {
        return uniPrice;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUniPrice(double uniPrice) {
        this.uniPrice = uniPrice;
    }

    public double getTotal(){
        return uniPrice*qty;
    }

    @Override
    public String toString() {
        return String.format("InvoiceItem[id = %s, desc = %s, unitPrice = %f ]",id,desc,uniPrice);
    }
}
