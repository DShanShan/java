package day15.Text.Text3;

public class TicketBean {
    private String name;
    private Integer num;

    public TicketBean(String name, Integer num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
