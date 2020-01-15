package day05;

public class Book {
    private String bnode;
    private String bname;
    private String bnum;
    private double price;
    private String bdate;

    public Book() {

    }

    public Book(String bnode, String bname, String bnum, double price, String bdate) {
        this.bnode = bnode;
        this.bname = bname;
        this.bnum = bnum;
        this.price = price;
        this.bdate = bdate;
    }

    public String getBnode() {
        return bnode;
    }

    public void setBnode(String bnode) {
        this.bnode = bnode;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBnum() {
        return bnum;
    }

    public void setBnum(String bnum) {
        this.bnum = bnum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public void showBook() {
        System.out.println("最贵的书是：" + bnode + "," + bname + "," + bnum + "," + price + "," + bdate);
    }


}
