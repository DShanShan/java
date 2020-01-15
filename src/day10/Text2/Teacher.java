package day10.Text2;

public class Teacher {
    private String tname;

    public Teacher() {
    }

    public Teacher(String tname) {
        this.tname = tname;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public void roll(String name,Boolean work){
        if (work){
            System.out.println("上课："+name);
        }else {
            System.out.println("旷课："+name);
        }
    }
}
