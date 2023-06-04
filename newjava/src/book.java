public class book {
    private String isb;
    private String name;
    private Nguoi nguoi;
    private float price;
    private int quantity;

    public String getIsb() {
        return isb;
    }

    public void setIsb(String isb) {
        this.isb = isb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Nguoi getNguoi() {
        return nguoi;
    }

    public void setNguoi(Nguoi nguoi) {
        this.nguoi = nguoi;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public book(String isb, String name, Nguoi nguoi, float price, int quantity) {
        this.isb = isb;
        this.name = name;
        this.nguoi = nguoi;
        this.price = price;
        this.quantity = quantity;
    }

    public  String toString()
    {
        return "sach:\t"+name+"\ntac gia:\t "+nguoi+"\ndon gia:\t"+price+"\nsp luong:\t"+quantity;
    }
}
