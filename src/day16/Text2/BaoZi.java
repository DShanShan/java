package day16.Text2;

public class BaoZi {
    private String name;
    private Integer flag;
    private Integer num;

    public BaoZi() {
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BaoZi(String name, Integer flag, Integer num) {
        this.name = name;
        this.flag = flag;
        this.num = num;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
