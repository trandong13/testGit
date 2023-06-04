public class Nguoi {
    private String ten;
    private int tuoi;
    private String que;

    public String toString() {
        return "ten = \t " + this.ten + "\n" + "tuoi = \t " + this.tuoi + "\n"
                + "que = \t " + this.que + "\n";
    }

    public Nguoi() {
    }

    public Nguoi(String ten, int tuoi, String que) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.que = que;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }
}
